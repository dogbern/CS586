package statePatternImp;
//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * Close Class
 */

//This class implements State class and defines the state Close

public class Close implements State {
	
	MDA_EFSM context = null;
	
	public Close(MDA_EFSM context){
		this.context = context;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incorrectLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incorrectPin(int max) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correctPinAboveMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incorrectLock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suspend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AboveMinBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noFunds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unLock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incorrectUnlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correctPinBelowMin() {
		// TODO Auto-generated method stub
		
	}

}
