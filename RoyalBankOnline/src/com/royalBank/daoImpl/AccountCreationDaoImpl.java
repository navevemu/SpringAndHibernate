package com.royalBank.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.royalBank.dao.AccountCreationDao;
import com.royalBank.dao.BankDao;
import com.royalBank.entity.CustomerAccountDetailsEntity;
import com.royalBank.entity.CustomerEntity;
import com.royalBank.models.Customer;
import com.royalBank.models.CustomerDetails;



public class AccountCreationDaoImpl implements AccountCreationDao{
	
	
	@Autowired
	public BankDao bankDao;
	
	
	public BankDao getBankDao() {
		return bankDao;
	}

	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}


	public  int saveCustomerDetails(CustomerEntity customer) {
		Session session=bankDao.getHibernateTemplate().getSessionFactory().openSession();
	Transaction t=	session.beginTransaction();
		int pk= (Integer) session.save(customer);	
		t.commit();
		return pk;
		
		
	}

	public int updateAccount(CustomerAccountDetailsEntity customer) {
		
		Session session=bankDao.getHibernateTemplate().getSessionFactory().openSession();
		Transaction t=	session.beginTransaction();
			long pk= (Long) session.save(customer);	
			t.commit();
			return (int)pk;
				}

	public boolean delete(int customerId) {
//		
		return false;
	}

	public CustomerDetails updateAccount(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
