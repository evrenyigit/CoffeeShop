package coffeeshop.concrete;

import coffeeshop.abstracts.BaseCustomerManager;

import coffeeshop.abstracts.CustomerCheckService;

import coffeeshop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		
		if(customerCheckService.checkIfRealPerson(customer))
		super.save(customer);
		else {
			throw new Exception("Not a valid person");
		}
		
	}

}
