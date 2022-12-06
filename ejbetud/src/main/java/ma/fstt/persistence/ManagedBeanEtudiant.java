package ma.fstt.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@SuppressWarnings("deprecation")
@ManagedBean(name = "etudiantManagedBean")
@RequestScoped
public class ManagedBeanEtudiant {

	@EJB(mappedName = "java:global/ejbetud-0.0.1-SNAPSHOT/sessionBean!ma.fstt.persistence.sessionBean")
     private RemoteInterfaceBean bean;
	
	
	 private List<Etudiant> etudList = new ArrayList<Etudiant>();
	 private Etudiant nnn;
	
public Etudiant getNnn() {
		return nnn;
	}







	public void setNnn(Etudiant nnn) {
		this.nnn = nnn;
	}







public String  ajouterEtudiant(ManagedBeanEtudiant etudiantBean) {
	  Etudiant n= new Etudiant();
	  n.setAdresse( etudiantBean.getAdresse());
		n.setCne( etudiantBean.getCne());
		n.setNom(etudiantBean.getNom());
		n.setPrenom(etudiantBean.getPrenom());
		n.setNiveau(etudiantBean.getNiveau());
		bean.saveEtudiant(n);
		
	return "listEtudiant.xhtml?faces-redirect=true";
		
		
	}
	






public String editetude(Etudiant use){
	Etudiant n= new Etudiant();
	id_etudiant=use.getId_etudiant(); 
	nom=use.getNom();
	prenom=use.getPrenom();
	cne=use.getCne();
	adresse= use.getAdresse();
	niveau= use.getNiveau();
	
	return "Modifier.xhtml";
	
}

public String editetudiant(ManagedBeanEtudiant etudiantBean){
	Etudiant n= new Etudiant();
	System.out.println("toz"+etudiantBean.getId_etudiant());
	n.setId_etudiant( etudiantBean.getId_etudiant());
	  n.setAdresse( etudiantBean.getAdresse());
		n.setCne( etudiantBean.getCne());
		n.setNom(etudiantBean.getNom());
		n.setPrenom(etudiantBean.getPrenom());
		n.setNiveau(etudiantBean.getNiveau());
		bean.update(n);
    return "listEtudiant.xhtml?faces-redirect=true";
}


public String delete(Etudiant getUser){
	bean.delete(getUser);
	this.etudList= bean.retrieveAllEtudiants() ;
	return "listEtudiant.xhtml";
	
   
   
}



	@SuppressWarnings("unchecked")
	public List<Etudiant> listerEtudiants() {
		
		
		return bean.retrieveAllEtudiants() ;
		
		
	}
	
private Long id_etudiant; 
private String nom; 
private String prenom;
private String cne;
private String adresse;
private int niveau;
public Long getId_etudiant() {
	return id_etudiant;
}
public void setId_etudiant(Long id_etudiant) {
	this.id_etudiant = id_etudiant;
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
public List<Etudiant> getEtudList() {
	return this.etudList;
}


public void setEtudList(List<Etudiant> etudList) {
	this.etudList = etudList;
}
}
