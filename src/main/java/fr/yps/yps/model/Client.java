package fr.yps.yps.model;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue
	private int id;

	private String nom, prenom, adresse, codePostal, ville;
	
	@OneToMany(mappedBy="client")
	private Set<Panier> lesPaniers;
	
	@OneToMany(mappedBy="createur")
	private Set<Sandwich> lesSandwichs;
	
	public Set<Panier> getLesPaniers() {
		return lesPaniers;
	}

	public void setLesPaniers(Set<Panier> lesPaniers) {
		this.lesPaniers = lesPaniers;
	}

	public Set<Sandwich> getLesSandwichs() {
		return lesSandwichs;
	}

	public void setLesSandwichs(Set<Sandwich> lesSandwichs) {
		this.lesSandwichs = lesSandwichs;
	}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
