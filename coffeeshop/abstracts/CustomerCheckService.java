package coffeeshop.abstracts;

import java.rmi.RemoteException;

import coffeeshop.entities.Customer;

public interface CustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer) throws RemoteException;

}
