/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.PersonDTO;
import dtos.PersonsDTO;
import entities.Person;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author jacob
 */
public class PersonFacade implements IPersonFacade {
    
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
    public PersonDTO addPerson(Person test) {
        Person pe = new Person(test.getFirstName(), test.getLastName(), test.getPhone(), test.getLastEdited(), test.getCreated());
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(pe);
            em.getTransaction().commit();
        }finally{
        em.close();
        }
        return new PersonDTO(pe);
        
    }


    
    
    

    @Override
    public PersonDTO deletePerson(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonDTO getPerson(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonsDTO getAllPersons() {
       EntityManager em = emf.createEntityManager();
       TypedQuery query = em.createQuery("SELECT p FROM Person p", Person.class);
       List<Person> p = query.getResultList();
       return new PersonsDTO(p);
        
       
    }

    @Override
    public PersonDTO editPerson(PersonDTO p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
