package Metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_utilisateur;
	@Column(name = "passager")
	
	private int id_passager;
	@Column(name = "Name_Siege")
	private String name_siege;
	@Column(name = "Name")
	private String name;
	@Column(name = "Email")
	private String email;
	

	public Utilisateur(int id_passager, String name_siege, String name, String email) {
		super();
		this.id_passager = id_passager;
		this.name_siege = name_siege;
		this.name = name;
		this.email = email;
	}
	
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
	
	public Utilisateur(int id_utilisateur,int id_passager, String name_siege,  String name, String email) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.id_utilisateur = id_passager;
		this.name_siege = name_siege;
		this.name = name;
		this.email = email;
	
	}

	public int getId_passager() {
		return id_passager;
	}

	public void setId_passager(int id_passager) {
		this.id_passager = id_passager;
	}

	public int getId_utilisateur() {
		return id_utilisateur;
	}

	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	
	

	public String getName_siege() {
		return name_siege;
	}

	public void setName_siege(String name_siege) {
		this.name_siege = name_siege;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
