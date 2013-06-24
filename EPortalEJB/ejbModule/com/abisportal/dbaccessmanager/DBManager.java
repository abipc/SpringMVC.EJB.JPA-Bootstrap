/**
 * 
 */
package com.abisportal.dbaccessmanager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author abhishek87
 *
 */
public class DBManager implements DBManagerLocal {
	
    @PersistenceContext(unitName = "ABI-RegDB-PU")
    private EntityManager registrationDB;
    
    @Override
    public EntityManager getEntityManagerForRegDB() {
        if (registrationDB == null) {
            NullPointerException npe = new NullPointerException("EntityManager is not setup for registration database.");
            throw npe;
        }
        return registrationDB;
    }    

}
