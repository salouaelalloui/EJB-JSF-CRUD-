package ma.fstt.persistence;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface RemoteInterfaceBean {
	   public String sayHello();
	   public  Etudiant saveEtudiant(Etudiant etud);
	   public List<Etudiant> retrieveAllEtudiants() ;
	   public Etudiant findEtudiant(Etudiant project);
	   public Etudiant update(Etudiant project);
	   public void delete(Etudiant project);
}
