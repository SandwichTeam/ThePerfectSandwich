package fr.yps.yps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue
	private int id;

	@OneToOne
	private Panier panier;

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
	
}
