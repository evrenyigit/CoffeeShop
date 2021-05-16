package coffeeshop;
import coffeeshop.entities.Customer;

import coffeeshop.abstracts.BaseCustomerManager;
import coffeeshop.adapters.MernisServiceAdapter;
import coffeeshop.concrete.StarbucksCustomerManager;

import coffeeshop.concrete.NeroCustomerManager;

public class Main {
	

	public static void main(String[] args) throws Exception {
		
		
		Customer customer = new Customer("TCN0","NAME","LASTNAME",1995);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.save(customer);

	}
}