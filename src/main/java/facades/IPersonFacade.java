/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.PersonDTO;
import dtos.PersonsDTO;
import entities.Person;

/**
 *
 * @author jacob
 */
public interface IPersonFacade {
    
  public PersonDTO addPerson(Person test);  
  public PersonDTO deletePerson(int id);  
  public PersonDTO getPerson(int id);  
  public PersonsDTO getAllPersons();  
  public PersonDTO editPerson(PersonDTO p);  

}
