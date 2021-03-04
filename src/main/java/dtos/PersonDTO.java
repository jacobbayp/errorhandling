/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Person;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jacob
 */
public class PersonDTO {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private Date created;
    private Date lastEdited;
    

    public PersonDTO(Person p) {
        this.id = p.getId();
        this.firstName = p.getFirstName();
        this.lastName = p.getLastName();
        this.phone = p.getPhone();
        this.created = p.getCreated();
        this.lastEdited = p.getLastEdited();
    }
    
    
    
       public static List<PersonDTO> getDtos(List<Person> persons){
        List<PersonDTO> PersonDtos = new ArrayList();
        persons.forEach(p->PersonDtos.add(new PersonDTO(p)));
        return PersonDtos;
        
       }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(Date lastEdited) {
        this.lastEdited = lastEdited;
    }
 
    
    
    
}
 

 
