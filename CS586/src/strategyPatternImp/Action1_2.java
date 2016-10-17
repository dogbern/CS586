package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.*;

/*
 * Action1_2 Class -> StoreData() Action
 */



//implements Action1 interface.
public class Action1_2 implements Action1 {
		
		
	//Stores data (pin, id, balance) from temporary data store to pin in data store
		public void StoreData(DataStore ds2){
			((DataStore2) ds2).setPin();
			((DataStore2) ds2).setId();
			((DataStore2) ds2).setBalance();
			System.out.println("The stored pin is: " +((DataStore2) ds2).pin);
			System.out.println("The stored id is: " +((DataStore2) ds2).id);
			System.out.println("The stored balance is: " +((DataStore2) ds2).balance);
			System.out.println("\nPlease Select Option 1 in the Operation Menu for login into your newly opened ACCOUNT-2");		
		}

}
