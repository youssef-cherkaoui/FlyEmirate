package Metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_Airport;
	@Column(name = "Name")
	private String name;
	@Column(name = "Ville_Depart")
	private String ville_depart;
	@Column(name = "Ville_Arrivee")
	private String ville_arrivee;
	@Column(name = "Pays")
	private String pays;
	
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Airport(String name, String ville_depart, String ville_arrivee, String pays) {
		super();
		this.name = name;
		this.ville_depart = ville_depart;
		this.ville_arrivee = ville_arrivee;
		this.pays = pays;
	}
	
	

	public Airport(int id_Airport, String name, String ville_depart, String ville_arrivee, String pays) {
		super();
		this.id_Airport = id_Airport;
		this.name = name;
		this.ville_depart = ville_depart;
		this.ville_arrivee = ville_arrivee;
		this.pays = pays;
	}

	public int getId_Airport() {
		return id_Airport;
	}
	public void setId_Airport(int id_Airport) {
		this.id_Airport = id_Airport;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVille_depart() {
		return ville_depart;
	}
	public void setVille_depart(String ville_depart) {
		this.ville_depart = ville_depart;
	}
	public String getVille_arrivee() {
		return ville_arrivee;
	}
	public void setVille_arrivee(String ville_arrivee) {
		this.ville_arrivee = ville_arrivee;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	

}
