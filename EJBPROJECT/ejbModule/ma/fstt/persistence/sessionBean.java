package ma.fstt.persistence;

import java.util.List;

import javax.ejb.Stateful;

import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class sessionBean
 */
@Stateful
@LocalBean
public class sessionBean implements RemoteInterfaceBean{
	 @PersistenceContext(unitName = "Etudiant")
	 private  EntityManager entityManager;
	 
	 public  Etudiant saveEtudiant(Etudiant etud ) {
	        entityManager.persist(etud);
	        return etud;
	    }
	 
	  public Etudiant findEtudiant(Etudiant project) {
	        Etudiant p = entityManager.find(Etudiant.class, project.getId_etudiant());
	        return p;
	    }
	  @SuppressWarnings("unchecked")
	    public List<Etudiant> retrieveAllEtudiants() {
	    	//entityMgrObj.
	       // String q = "SELECT p from " + Etudiant.class.getName() + " p";
	        Query query = entityManager.createQuery("SELECT c FROM Etudiant AS c ",Etudiant.class);
	       
			List<Etudiant> etudiants = query.getResultList();
	        return etudiants;
	    }
	 
	    public String sayHello() {
	        return "Hello World !!!";
	    }
    public sessionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Etudiant update(Etudiant project) {
		entityManager.merge(project);
		
         return project;
	}

	@Override
	public void delete(Etudiant project) {
		entityManager.remove(entityManager.merge(project));
		entityManager.flush();
          
	}

}
