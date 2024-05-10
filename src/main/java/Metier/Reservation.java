package Metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Reservation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_reservation;
	@Column (name="id_Utilisateur")
	private int id_utilisateur;
	@Column (name="id_Vol")
	private int id_vol;
	@Column (name="Detail_Passager")
	private String Detail_Pasager;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(int id_reservation) {
		this.id_reservation = id_reservation;
	}
	public int getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public int getId_vol() {
		return id_vol;
	}
	public void setId_vol(int id_vol) {
		this.id_vol = id_vol;
	}
	public String getDetail_Pasager() {
		return Detail_Pasager;
	}
	public void setDetail_Pasager(String detail_Pasager) {
		Detail_Pasager = detail_Pasager;
	}
	public Reservation(int id_reservation, int id_utilisateur, int id_vol, String detail_Pasager) {
		super();
		this.id_reservation = id_reservation;
		this.id_utilisateur = id_utilisateur;
		this.id_vol = id_vol;
		Detail_Pasager = detail_Pasager;
	}
	public Reservation(int id_utilisateur, int id_vol, String detail_Pasager) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.id_vol = id_vol;
		Detail_Pasager = detail_Pasager;
	}

}
