package strategyPatternImp;

//**********STRATEGY PATTERN IMPLEMENTATION***********************

import dataStores.DataStore;

/*
 * Action1 interface
 */


//This interface helps stores pin from temporary data store to pin in data store
public interface Action1 {
	
	public void StoreData(DataStore ds);

	
	

}
