package Metier;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Vol {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id_utilisateur;
	@Id
	@Column(name = "id_airport")
	private int id_Airport;
	@Column(name = "Compagnie")
	private String Compagnie;
	@Column(name = "Date_Depart")
	private Date date_depart;
	@Column(name = "Date_Arrivee")
	private Date date_arrivee;		
	@Column(name = "Prix")
	private float prix;
	
	
	
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Vol(int id_Airport, String compagnie, Date date_depart, Date date_arrivee, float prix) {
		super();
		this.id_Airport = id_Airport;
		Compagnie = compagnie;
		this.date_depart = date_depart;
		this.date_arrivee = date_arrivee;
		this.prix = prix;
	}
	
	
	
	
	
	public Vol(int id_utilisateur, int id_Airport, String compagnie, Date date_depart, Date date_arrivee, float prix) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.id_Airport = id_Airport;
		Compagnie = compagnie;
		this.date_depart = date_depart;
		this.date_arrivee = date_arrivee;
		this.prix = prix;
	}



	public int getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public int getId_Airport() {
		return id_Airport;
	}
	public void setId_Airport(int id_Airport) {
		this.id_Airport = id_Airport;
	}
	public String getCompagnie() {
		return Compagnie;
	}
	public void setCompagnie(String compagnie) {
		Compagnie = compagnie;
	}
	public Date getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(java.util.Date dateDepart) {
		this.date_depart = (Date) dateDepart;
	}
	public Date getDate_arrivee() {
		return date_arrivee;
	}
	public void setDate_arrivee(java.util.Date dateArrivee) {
		this.date_arrivee = (Date) dateArrivee;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
}
