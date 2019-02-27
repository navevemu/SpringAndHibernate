package com.royalBank.dao;

import com.royalBank.entity.CustomerAccountDetailsEntity;
import com.royalBank.entity.CustomerEntity;
import com.royalBank.models.CustomerDetails;

public interface AccountCreationDao {

	public int saveCustomerDetails(CustomerEntity customerEntity);
	
	public int updateAccount(CustomerAccountDetailsEntity customer);
	public boolean delete(int customerId);
	
}
