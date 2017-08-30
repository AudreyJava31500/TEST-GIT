package com.gtm.demorest.domaine;

public class Employe {

	String nom;
	String prenom;
	
	//Getters & setters
	
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
		
	
	//Constructeur 	
	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Employe() {
		super();
	}
	
	//Méthode to string
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}
	/**
	 * Méthode Poser conger
	 */
	public void poserConges() {
		System.out.println("le collègue " +this.prenom + " " + this.nom + " pose des conges.... le veinard)");
	}
	

	
	
}


