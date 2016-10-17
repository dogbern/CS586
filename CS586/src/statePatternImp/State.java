package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************
/*
 * State Interface
 */

//This Interface is implemented by the other State classes to define a State

public interface State {

	 public void open();
	 public void login();
	 public void logout();
	 public void incorrectLogin();
	 public void incorrectPin(int max);
	 public void correctPinAboveMin();
	 public void incorrectLock();
	 public void deposit();
	 public void balance();
	 public void suspend();
	 public void activate();
	 public void lock();
	 public void withdraw();
	 public void AboveMinBalance();
	 public void noFunds();
	 public void close();
	 public void unLock();
	 public void incorrectUnlock();
	 public void withdrawBelowMinBalance();
	 public void BelowMinBalance();
	 public void correctPinBelowMin();

}
