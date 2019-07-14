
package com.codenotfound.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.codenotfound.model.Academics;
import com.codenotfound.services.AcademicsService;

@Named
public class AcademicsController {
    
    private String firstName = "Jhon";
    private String lastName = "Doe";
    
    private List<Academics> listaAcademics = new ArrayList<Academics>();
    
    @Inject
    private AcademicsService academicsServices;
    
    @PostConstruct
    public void init(){
        this.listaAcademics = academicsServices.getAcademicsList();
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String fistName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String showGreeting(){
        Academics a = new Academics();
        a.setNombre(lastName + " " + lastName);
        this.listaAcademics.add(a);
        return "Hello " + firstName + " " + lastName + "!";
    }
    
    public List<Academics> getListaAcademics(){
        return listaAcademics;
    }
}
