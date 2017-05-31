package fr.yps.yps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sandwich {
	@Id
	@GeneratedValue
	private int id;

	private String nom;
	
	@ManyToOne
	private Client createur;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Client getCreateur() {
		return createur;
	}

	public void setCreateur(Client createur) {
		this.createur = createur;
	}
	
}
