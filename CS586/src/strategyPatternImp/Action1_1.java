package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.*;

/*
 * Action1_1 Class -> StoreData() Action
 */

//implements Action1 interface.
public class Action1_1 implements Action1 {
	
	//Stores data from temporary data store to pin in data store
	public void StoreData(DataStore ds1){
		((DataStore1) ds1).setPin();
		((DataStore1) ds1).setId();
		((DataStore1) ds1).setBalance();
		System.out.println("The stored pin is: " +((DataStore1)ds1).getPin());
		System.out.println("The stored balance  is: " +((DataStore1)ds1).getBalance());
		System.out.println("The stored ID is : " +((DataStore1)ds1).getId());
		System.out.println("\nPlease Select Option 1 in the Operation Menu for login into your newly opened ACCOUNT-1");
		
	}

}
