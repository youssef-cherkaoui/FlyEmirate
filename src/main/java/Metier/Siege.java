package Metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Siege {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numero_siege;
	@Column(name = "Name_siege")
	private String name;
	@Column(name = "Etat_siege")
	private String etat_siege;
	@Column(name = "Id_Vol")
	private String id_vol;
	
	
	
	public Siege(int numero_siege, String name, String etat_siege, String id_vol) {
		super();
		this.numero_siege = numero_siege;
		this.name = name;
		this.etat_siege = etat_siege;
		this.id_vol = id_vol;
	}
	public Siege(String name, String etat_siege, String id_vol) {
		super();
		this.name = name;
		this.etat_siege = etat_siege;
		this.id_vol = id_vol;
	}
	public Siege() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNumero_siege() {
		return numero_siege;
	}
	public void setNumero_siege(int numero_siege) {
		this.numero_siege = numero_siege;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEtat_siege() {
		return etat_siege;
	}
	public void setEtat_siege(String etat_siege) {
		this.etat_siege = etat_siege;
	}
	public String getId_vol() {
		return id_vol;
	}
	public void setId_vol(String id_vol) {
		this.id_vol = id_vol;
	}
}
