package ma.fstt.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
public class Etudiant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_etudiant ;
	
	@Column(length = 255, nullable = true)
	private String nom;
	
	
	@Column(length = 255, nullable = true)
	private String prenom;
	
	
	@Column(length = 255, nullable = true)
	private String cne;
	@Column(length = 20, nullable = true)
	private String adresse;
	@Column(length = 5, nullable = true)
	private int niveau;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public Long getId_etudiant() {
		return id_etudiant;
	}


	public void setId_etudiant(Long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCne() {
		return cne;
	}


	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}







	public int getNiveau() {
		return niveau;
	}







	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}







	public Etudiant(Long id_etudiant, String nom, String prenom, String cne, String adresse, int niveau) {
		super();
		this.id_etudiant = id_etudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.cne = cne;
		this.adresse = adresse;
		this.niveau = niveau;
	}







}
