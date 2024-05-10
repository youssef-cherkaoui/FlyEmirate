package Metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Passager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_passager;
	@Column(name = "name")
	private String name;
	
	
	
	
	public Passager(int id_passager, String name) {
		super();
		this.id_passager = id_passager;
		this.name = name;
	}
	
	
	
	public Passager(String name) {
		super();
		this.name = name;
	}

	
	


	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId_passager() {
		return id_passager;
	}
	public void setId_passager(int id_passager) {
		this.id_passager = id_passager;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
