package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;

import com.codenotfound.model.Academics;
import com.codenotfound.model.factory.DAOFactory;
import com.codenotfound.model.factory.AcademicsDaoFactory;
        
@Named
public class AcademicsService {
    private AcademicsDaoFactory academicsDaoFactory;
    
    public AcademicsService(){
        this.academicsDaoFactory = (AcademicsDaoFactory)DAOFactory.getDAOFactory(DAOFactory.ACADEMICS_REPOSITORY);
    }
    
    public List<Academics> getAcademicsList(){
        return this.academicsDaoFactory.getAcademicsDao().findAll();
    }
}
