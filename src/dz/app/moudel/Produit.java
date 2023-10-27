package dz.app.moudel;

import java.sql.Date;

public class Produit {
    private int id ;
	private String type ;
	private String modal ;
	private String prix ;
	private String vendeur ;
	private String destribiteur ;
	private Date date;
	private String statut ;
	private String tel ;
	private String address ;

	public Produit() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	
	public Produit(String type, String modal, String prix , String vendeur , String destribiteur, Date date , String statut , String tel , String address  ) {
		super();
		this.type = type;
		this.modal = modal;
		this.prix = prix;
		this.vendeur = vendeur;
		this.destribiteur = destribiteur;
		this.date = date;
		this.statut = statut;
		this.tel = tel;
		this.address = address;
		
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getModal() {
		return modal;
	}



	public void setModal(String modal) {
		this.modal = modal;
	}



	public String getPrix() {
		return prix;
	}



	public void setPrix(String prix) {
		this.prix = prix;
	}



	public String getVendeur() {
		return vendeur;
	}



	public void setVendeur(String vendeur) {
		this.vendeur = vendeur;
	}



	public String getDestribiteur() {
		return destribiteur;
	}



	public void setDestribiteur(String destribiteur) {
		this.destribiteur = destribiteur;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getStatut() {
		return statut;
	}



	public void setStatut(String statut) {
		this.statut = statut;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}


}
