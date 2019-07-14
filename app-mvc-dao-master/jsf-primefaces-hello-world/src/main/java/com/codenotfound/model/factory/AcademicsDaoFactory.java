
package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicsDao;

public abstract class AcademicsDaoFactory extends DAOFactory {
    
    public abstract AcademicsDao getAcademicsDao();
    
}
