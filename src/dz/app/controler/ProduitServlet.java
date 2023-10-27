package dz.app.controler;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import dz.app.deo.Produitdeo;
import dz.app.moudel.Produit;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/ProduitServlet")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Produitdeo produitdeo = new Produitdeo() ; 

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession() ;
		if((String)session.getValue("email") != null) {
			request.getRequestDispatcher("produit.jsp").forward(request , response) ;
		}else {
			request.getRequestDispatcher("login.jsp").forward(request , response) ;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map <String, Object> map = new HashMap<String  , Object>() ;
		HttpSession session = request.getSession() ;
		String type = request.getParameter("type");
		String model = request.getParameter("model");
		String prix = request.getParameter("prix");
		@SuppressWarnings("deprecation")
		String vendeur = (String)session.getValue("email");
		String destributer = request.getParameter("distribut");
		String statut = request.getParameter("statut");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
	
		
		Produit produit = new Produit();
		produit.setType(type);
		produit.setModal(model);
		produit.setPrix(prix);
		produit.setVendeur(vendeur);
		produit.setDestribiteur(destributer);
		produit.setStatut(statut);
		produit.setTel(tel);
		produit.setAddress(address);
	
	
	try {
		produitdeo.regesterproduit(produit);
		map.put("isvalid", true) ;
		
		}		
	 catch(ClassNotFoundException e) {
		 e.printStackTrace();
		 map.put("isvalid", false) ; 
	 }
	 write(response , map);
	// response.sendRedirect("");
	
	}

	private void write(HttpServletResponse response, Map<String, Object> map) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("ISO-8859-1");
		response.getWriter().write(new Gson().toJson(map));
	
	}

}
