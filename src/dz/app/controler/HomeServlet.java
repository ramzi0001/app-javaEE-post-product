package dz.app.controler;

import java.io.IOException;
import java.sql.SQLException;
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
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Produit produit = new Produit();
	Produitdeo produitdeo = new Produitdeo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
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
			response.setContentType("text/html;charset=UTF-8");
	        
			String type =  request.getParameter("type");
			String model = request.getParameter("model");
			produit.setType(type);
			produit.setModal(model);
			
	        try {
				request.setAttribute("session", (String)session.getValue("email"));
				request.setAttribute("produitlist", produitdeo.produitlist(produit));
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("home.jsp").forward(request , response) ;
			System.out.println("hello " + (String)session.getValue("email")); 
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
		
		String id = request.getParameter("id");
	
	try { 
	   produitdeo.supprime(id);
	}
 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  write(response , map);

	}

	private void write(HttpServletResponse response, Map<String, Object> map) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("ISO-8859-1");
		response.getWriter().write(new Gson().toJson(map));
	}
		
}
	

