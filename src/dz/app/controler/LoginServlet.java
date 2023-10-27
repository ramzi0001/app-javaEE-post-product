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

import dz.app.deo.Userdeo;
import dz.app.moudel.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Userdeo userdeo = new Userdeo() ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession() ;
		response.getWriter().append("Served at: ").append(request.getContextPath());
		if((String)session.getValue("email") == null) {
	     request.getRequestDispatcher("login.jsp").forward(request , response) ;}
		else {
	     request.getRequestDispatcher("home.jsp").forward(request , response) ;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Map <String, Object> map = new HashMap<String  , Object>() ;
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
	
	try {
		if(userdeo.uservalid(user)) {
		map.put("isvalid", true) ;
		HttpSession session = request.getSession(true);
		session.putValue("email", email);
		//response.sendRedirect(request.getContextPath() +"/HomeServlet");
		
		}
		else {
			map.put("isvalid", false) ;
			
		}	
	}
	 catch(ClassNotFoundException | SQLException e) {
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


