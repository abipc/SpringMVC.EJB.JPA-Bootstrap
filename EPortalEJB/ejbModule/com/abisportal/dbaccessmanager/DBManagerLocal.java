/**
 * 
 */
package com.abisportal.dbaccessmanager;

import javax.persistence.EntityManager;

/**
 * @author abhishek87
 *
 */
public interface DBManagerLocal {
	
	EntityManager getEntityManagerForRegDB ();

}
