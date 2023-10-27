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

import com.google.gson.Gson;

import dz.app.deo.Userdeo;
import dz.app.moudel.User;

/**
 * Servlet implementation class GetPassword
 */
@WebServlet("/GetPassword")
public class GetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Userdeo userdeo = new Userdeo() ; 

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("password.jsp").forward(request , response) ;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	Map <String, Object> map = new HashMap<String  , Object>() ;
		
	
		String email = request.getParameter("email");
	
		
		User user = new User();

		user.setEmail(email);

	
	
		try {
			if(userdeo.userexict(user)) {

			map.put("exist", true) ;
			}
			else {
				map.put("exist", false) ;
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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