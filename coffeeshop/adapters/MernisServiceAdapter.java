package coffeeshop.adapters;

import java.rmi.RemoteException;

import coffeeshop.abstracts.CustomerCheckService;

import coffeeshop.entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getId()), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getYearOfBirth());
	}
	

}