package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicsDao;
import com.codenotfound.model.dao.AcademicsDaoImpl;

public class AcademicsDaoFactoryImpl extends AcademicsDaoFactory {
    
    @Override
    public AcademicsDao getAcademicsDao(){
        return new AcademicsDaoImpl();
    }
}
