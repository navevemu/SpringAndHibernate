package com.royalBank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.royalBank.business.AccountCreation;
import com.royalBank.models.Customer;
import com.royalBank.models.CustomerDetails;


@Controller
public class AccountCreationController {
	@Autowired
	private AccountCreation accountCreation;
	
	public void setAccountCreation(AccountCreation accountCreation) {
		this.accountCreation = accountCreation;
	}
	
	public AccountCreation getAccountCreation() {
		return accountCreation;
	}
	
	@RequestMapping(value="/accountCreation", method=RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("customer") Customer customer,BindingResult res) {
		
		if(res.hasErrors()) {
			System.out.println("binding error");
		}
		int accountNo=accountCreation.createAccount(customer);
		ModelAndView mv=new ModelAndView("customerDetails");
		mv.addObject("accountNo",accountNo);
				
		return mv;
		
	}
	
	@RequestMapping(value="/customerDetails", method=RequestMethod.POST)
	public ModelAndView updateAccountDetails(@ModelAttribute("customerDetails") CustomerDetails customerDetails,BindingResult res) {
		
		if(res.hasErrors()) {
			System.out.println("binding error");
		}
		CustomerDetails cd=accountCreation.updateAccountDetails(customerDetails);
		ModelAndView mv=new ModelAndView("accountCreationSuccess");
		mv.addObject("cd",cd.toString());				
		return mv;
		
	}

}
