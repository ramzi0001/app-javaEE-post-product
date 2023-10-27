package dz.app.deo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dz.app.moudel.Produit;

public class Produitdeo {
	

	public ArrayList<Produit> myproduits(String email) throws SQLException, ClassNotFoundException{
		ArrayList<Produit> myproduits = new ArrayList<Produit>() ;


		int i =0 ;
		String SELECT_PRODUIT = "select * from  produits where vendeur=?;" ;
				
				
				Class.forName("com.mysql.jdbc.Driver");
				try (Connection connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
						PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUIT)){
					    preparedStatement.setString(1 , email);
				
					
		                ResultSet rs=preparedStatement.executeQuery();
		                
		                try {
		                	while(rs.next()) {
		                		Produit produit1 = new Produit();
								produit1.setType(rs.getString("type"));	
								produit1.setPrix(rs.getString("prix"));
								produit1.setModal(rs.getString("modal"));
								produit1.setVendeur(rs.getString("vendeur"));
								produit1.setDate(rs.getDate("dateshir"));
								produit1.setDestribiteur(rs.getString("destribeteur"));
								produit1.setTel(rs.getString("tel"));
								produit1.setAddress(rs.getString("address"));
								produit1.setStatut(rs.getString("statut"));

								myproduits.add(produit1);
								System.out.println(myproduits.get(i).getModal());
								i++;

		                	}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		               return myproduits;
		                }}
	
	
	public ArrayList<Produit> produitlist(Produit produit) throws SQLException, ClassNotFoundException {
		ArrayList<Produit> produitlist = new ArrayList<Produit>() ;
		
		
		if(produit.getType()!="" && produit.getModal()!="" ) {
			

			
			String SELECT_PRODUIT = "select * from  produits where type=? and modal = ? ;" ;
					
					
					Class.forName("com.mysql.jdbc.Driver");
					try (Connection connection = DriverManager
							.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
							PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUIT)){
							
						
						preparedStatement.setString(1 , produit.getType());
						preparedStatement.setString(2 , produit.getModal());

			                ResultSet rs=preparedStatement.executeQuery();
			                int i=0;
			                try {
			                	while(rs.next()) {
			                		Produit produit1 = new Produit();
									produit1.setType(rs.getString("type"));	
									produit1.setPrix(rs.getString("prix"));
									produit1.setModal(rs.getString("modal"));
									produit1.setVendeur(rs.getString("vendeur"));
									produit1.setDate(rs.getDate("dateshir"));
									produit1.setDestribiteur(rs.getString("destribeteur"));
									produit1.setTel(rs.getString("tel"));
									produit1.setAddress(rs.getString("address"));
									produit1.setStatut(rs.getString("statut"));

									produitlist.add(produit1);
									
									System.out.println(produitlist.get(i));
									i++;

			                	}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			               return produitlist;
			                }
		}
		
		
		else if (produit.getType()=="" && produit.getModal()!="" ){
			

			int i =0 ;
			String SELECT_PRODUIT = "select * from  produits where modal= ? ;" ;
					
					
					Class.forName("com.mysql.jdbc.Driver");
					try (Connection connection = DriverManager
							.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
							PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUIT)){
							
						
						preparedStatement.setString(1 , produit.getModal());
			                ResultSet rs=preparedStatement.executeQuery();
			                
			                try {
			                	while(rs.next()) {
			                		Produit produit1 = new Produit();
									produit1.setType(rs.getString("type"));	
									produit1.setPrix(rs.getString("prix"));
									produit1.setModal(rs.getString("modal"));
									produit1.setVendeur(rs.getString("vendeur"));
									produit1.setDate(rs.getDate("dateshir"));
									produit1.setDestribiteur(rs.getString("destribeteur"));
									produit1.setTel(rs.getString("tel"));
									produit1.setAddress(rs.getString("address"));
									produit1.setStatut(rs.getString("statut"));

									produitlist.add(produit1);
									System.out.println(produitlist.get(i));
									i++;
			                	}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			                
			               return produitlist;
			                }
		}
		else if (produit.getModal()=="" && produit.getType()!="" ){
			

			int i = 0;
			String SELECT_PRODUIT = "select * from  produits where type=? ;" ;
					
					
					Class.forName("com.mysql.jdbc.Driver");
					try (Connection connection = DriverManager
							.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
							PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUIT)){
							
						
						preparedStatement.setString(1 , produit.getType());
			                ResultSet rs=preparedStatement.executeQuery();
			                
			                try {
			                	while(rs.next()) {
			                		Produit produit1 = new Produit();
									produit1.setType(rs.getString("type"));	
									produit1.setPrix(rs.getString("prix"));
									produit1.setModal(rs.getString("modal"));
									produit1.setVendeur(rs.getString("vendeur"));
									produit1.setDate(rs.getDate("dateshir"));
									produit1.setDestribiteur(rs.getString("destribeteur"));
									produit1.setTel(rs.getString("tel"));
									produit1.setAddress(rs.getString("address"));
									produit1.setStatut(rs.getString("statut"));

									produitlist.add(produit1);
									System.out.println(produitlist.get(i));
									i++;
			                	}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			               return produitlist;
			                }
		}
				
		
		else {
			

			int i =0 ;
			String SELECT_PRODUIT = "select * from  produits ;" ;
					
					
					Class.forName("com.mysql.jdbc.Driver");
					try (Connection connection = DriverManager
							.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
							PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUIT)){
							
						
			                ResultSet rs=preparedStatement.executeQuery();
			                
			                try {
			                	while(rs.next()) {
			                		Produit produit1 = new Produit();
									produit1.setId(rs.getInt("id"));	
									produit1.setType(rs.getString("type"));	
									produit1.setPrix(rs.getString("prix"));
									produit1.setModal(rs.getString("modal"));
									produit1.setVendeur(rs.getString("vendeur"));
									produit1.setDate(rs.getDate("dateshir"));
									produit1.setDestribiteur(rs.getString("destribeteur"));
									produit1.setTel(rs.getString("tel"));
									produit1.setAddress(rs.getString("address"));
									produit1.setStatut(rs.getString("statut"));
									produitlist.add(produit1);
									System.out.println(produitlist.get(i).getModal());
									i++;

			                	}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			               return produitlist;
			                }
		}
	
		
	}
	
	
	
public void regesterproduit(Produit produit) throws ClassNotFoundException {
			
		String INSERT_PRODUIT = "INSERT INTO produits" +
		"(type,modal,prix,vendeur,destribeteur,statut,tel,address,dateshir) VALUES" +
		"(?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP());";
		
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUIT)){
				preparedStatement.setString(1 , produit.getType());
				preparedStatement.setString(2 , produit.getModal());
				preparedStatement.setString(3 , produit.getPrix());
				preparedStatement.setString(4 , produit.getVendeur());
				preparedStatement.setString(5 , produit.getDestribiteur());
				preparedStatement.setString(6 , produit.getStatut());
				preparedStatement.setString(7 , produit.getTel());
				preparedStatement.setString(8 , produit.getAddress());
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate() ;
				
		}catch (SQLException e ) {
			e.printStackTrace();
		}
		
	}


public void supprime(String id) throws ClassNotFoundException {
		
	String INSERT_PRODUIT = "delete from produits where id=?;";
	
	Class.forName("com.mysql.jdbc.Driver");
	try (Connection connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/mysql_database?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUIT)){
			preparedStatement.setString(1 , id);

			System.out.println(preparedStatement);
			preparedStatement.executeUpdate() ;
			
	}catch (SQLException e ) {
		e.printStackTrace();
	}
	
}


}
