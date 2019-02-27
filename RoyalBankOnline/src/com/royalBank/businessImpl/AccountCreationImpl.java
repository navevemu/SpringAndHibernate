package com.royalBank.businessImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.royalBank.business.AccountCreation;
import com.royalBank.dao.AccountCreationDao;
import com.royalBank.entity.CustomerAccountDetailsEntity;
import com.royalBank.entity.CustomerEntity;
import com.royalBank.models.Customer;
import com.royalBank.models.CustomerDetails;


public class AccountCreationImpl implements AccountCreation{
	

	
	@Autowired
	private AccountCreationDao accountCreationDao;
	

	public int createAccount(Customer customer) {
		
		CustomerEntity customerEntity=modelToEntity(customer);
		
		int pk=accountCreationDao.saveCustomerDetails(customerEntity);
		
		

		return pk;
		
	}
	
	public AccountCreationDao getAccountCreationDao() {
		return accountCreationDao;
	}

	public void setAccountCreationDao(AccountCreationDao accountCreationDao) {
		this.accountCreationDao = accountCreationDao;
	}

	private CustomerEntity modelToEntity(Customer cus) {
		CustomerEntity ce=new CustomerEntity();
		
		ce.setFirst_name(cus.getFirstName());
		ce.setLast_name(cus.getLastName());
		ce.setFather_name(cus.getFatherName());
		ce.setDob(cus.getDob());
		ce.setAddress(cus.getAddress().toString());
		ce.setEmailId(cus.getEmailId());
		ce.setGender(cus.getGender());
		ce.setPassword(cus.getPassword());
		ce.setOccupation(cus.getOccupation());
		ce.setMobNo(cus.getMobNo());
		
		return ce;
		
		
		
	}
	private CustomerAccountDetailsEntity modelToEntity(CustomerDetails cd) {
		CustomerAccountDetailsEntity ce=new CustomerAccountDetailsEntity();
		ce.setAccount_number(cd.getAccountNo());
		ce.setAdhar_number(cd.getAdharNo());
		ce.setBank_ifsc(cd.getBankIfsc());
		ce.setPan_number(cd.getPanNo());
		ce.setSaving_amount(cd.getSavingsAmount());
		ce.setFixed_amount(cd.getDepositAmount());
		
		return ce;
		
	}

	public CustomerDetails updateAccountDetails(CustomerDetails customer) {
		
CustomerAccountDetailsEntity customerDetailsEntity=modelToEntity(customer);
		
		int pk=accountCreationDao.updateAccount(customerDetailsEntity);
		
		return customer;

	}

	public boolean deleteAccount(Customer customer) {
		
		return false;
	}
	

}
