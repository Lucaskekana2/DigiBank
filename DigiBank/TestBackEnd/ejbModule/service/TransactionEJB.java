package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TransactionEntity;

/**
 * Session Bean implementation class TransactionEJB
 */
@Stateless
@LocalBean
public class TransactionEJB {

	@PersistenceContext
	private EntityManager em;
	
    public TransactionEJB() {
    	
    }
    
    public void addNewTransaction(TransactionEntity transactionEntity)
    {
    	System.out.println(" adding data ");
    	em.persist(transactionEntity);  /*save data TO DB*/
    	
    }

}
