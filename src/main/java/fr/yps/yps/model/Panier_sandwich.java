package fr.yps.yps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Panier_sandwich {
	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	private Panier panier;
	
	@ManyToOne
	private Sandwich sandwich;
	
	private int quantite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Sandwich getSandwich() {
		return sandwich;
	}

	public void setSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
