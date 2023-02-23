package facades;

import dtos.PersonDTO;
import dtos.PersonsDTO;
import dtos.RenameMeDTO;
import entities.RenameMe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class PersonFacade implements IPersonFacade{

    private static PersonFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private PersonFacade() {}


    /**
     *
     * @param _emf
     * @return an instance of this facade class.
     */
    public static PersonFacade getPersonFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new PersonFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }



    @Override
    public PersonDTO addPerson(String fName, String lName, String phone) {
        PersonDTO p = new PersonDTO(p.getFirstName(), p.getLastName());
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        //return new PersonDTO(p);
        return null;
    }

    @Override
    public PersonDTO deletePerson(int id) {
        return null;
    }

    @Override
    public PersonDTO getPerson(int id) {
        return null;
    }

    @Override
    public PersonsDTO getAllPersons() {
        return null;
    }

    @Override
    public PersonDTO editPerson(PersonDTO p) {
        return null;
    }
}
