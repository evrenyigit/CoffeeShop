package coffeeshop.concrete;

import coffeeshop.abstracts.CustomerCheckService;

import coffeeshop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
	

}
