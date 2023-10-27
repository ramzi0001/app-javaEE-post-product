package dz.app.deo;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dz.app.moudel.User;

public class Userdeo {
	
	
	public boolean uservalid(User user) throws SQLException, ClassNotFoundException {
		String SELECT_USERS = "select * from  users where email=? and password =?;" ;
				
				
				Class.forName("com.mysql.jdbc.Driver");
				try (Connection connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
						PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERS)){
						preparedStatement.setString(1 , user.getEmail());
						preparedStatement.setString(2 , user.getPassword());
		                ResultSet rs=preparedStatement.executeQuery();
		               return rs.next();
		                }
	}
	
	public boolean userexict(User user) throws SQLException, ClassNotFoundException {
		String SELECT_USERS = "select * from  users where email=?;" ;
	    boolean resultat = false ;
				
				Class.forName("com.mysql.jdbc.Driver");
				try (Connection connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
						PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERS)){
						preparedStatement.setString(1 , user.getEmail());
		                ResultSet rs=preparedStatement.executeQuery();
		                
		                try {
		                	if(rs.next()) {
							user.setUsername(rs.getString("username"));
							user.setEmail(rs.getString("email"));
							user.setPassword(rs.getString("password"));	
							System.out.println(user.getUsername());
							System.out.println(user.getPassword());
							resultat = true ;
							

		                	}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		               return resultat;
		                }
	}
	
	public int regesteruser(User user) throws ClassNotFoundException {
		
		String INSERT_USERS = "INSERT INTO users" +
		"(username,email,password) VALUES" +
		"(?,?,?);";
		 int result = 0 ;
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS)){
				preparedStatement.setString(1 , user.getUsername());
				preparedStatement.setString(2 , user.getEmail());
				preparedStatement.setString(3 , user.getPassword());
				System.out.println(preparedStatement);
				result = preparedStatement.executeUpdate() ;
				
		}catch (SQLException e ) {
			e.printStackTrace();
		}
		return result ;
	}

	public void updatename(User user) throws ClassNotFoundException {
		
		String INSERT_PRODUIT = "update users set username=? where email=?;";
		
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUIT)){
			    preparedStatement.setString(1 , user.getUsername());
			    preparedStatement.setString(2 , user.getEmail());
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate() ;
				
		}catch (SQLException e ) {
			e.printStackTrace();
		}
		
	}
	public void updateemail(User user ,String newemail) throws ClassNotFoundException {
		
		String INSERT_PRODUIT = "update users set newemail=? where email=?;";
		
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUIT)){
			    preparedStatement.setString(1 , user.getEmail());
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate() ;
				
		}catch (SQLException e ) {
			e.printStackTrace();
		}
		
	}
	
}
