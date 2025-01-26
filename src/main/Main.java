package main;

import core.services.Bank;
import core.Client;
import core.services.Provider;
import core.services.Store;
import core.services.interfaces.IBank;
import core.services.interfaces.IProvider;
import core.services.interfaces.IStore;

public class Main {

	public static void main(String[] args) {
		IProvider prov = new Provider();
		IBank bank = new Bank();
		IStore store = new Store();
		store.setBank(bank);
		store.setProvider(prov);

		Client cl = new Client();
		cl.setStore(store);
		
		cl.run();

	}

}
