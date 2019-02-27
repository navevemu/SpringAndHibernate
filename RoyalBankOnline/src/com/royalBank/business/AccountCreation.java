package com.royalBank.business;

import com.royalBank.models.Customer;
import com.royalBank.models.CustomerDetails;

public interface AccountCreation {
	
	public int createAccount(Customer customer);
	public CustomerDetails updateAccountDetails(CustomerDetails customer);
	public boolean deleteAccount(Customer customer);
	
	
	
	

}
