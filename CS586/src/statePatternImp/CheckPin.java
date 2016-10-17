package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * CheckPin Class
 */

//This class implements State class and defines the state CheckPin
public class CheckPin implements State {
	
	MDA_EFSM context = null;
	
	public CheckPin(MDA_EFSM context){
		this.context = context;
	}

	@Override
	public void open() {
		

	}

	@Override
	public void login() {
		

	}

	@Override
	public void logout() {
		context.setState(context.getIdleState());

	}

	@Override
	public void incorrectLogin() {
		

	}

	@Override
	public void incorrectPin(int max) {
		
		
		if(context.attempts < max){
			 context.attempts++;
			 context.output.IncorrectPinMsg();
			 System.out.println("Number of attempts: "+context.attempts);
			 
			
			 
			
		 }
		 else 
			 if(context.attempts == max){
				 context.output.IncorrectPinMsg();
				 System.out.println("Number of attempts is equal to : "+max);
				 context.output.TooManyAttemptsMsg();
				 context.setState(context.getIdleState());
			 }
		

	}

	@Override
	public void correctPinAboveMin() {
		
		context.output.DisplayMenu();
		context.setState(context.getReadyState());

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
	

	}

	@Override
	public void close() {
		

	}

	@Override
	public void unLock() {
		

	}

	@Override
	public void incorrectUnlock() {
		

	}

	@Override
	public void withdrawBelowMinBalance() {
		

	}

	@Override
	public void BelowMinBalance() {
		

	}

	@Override
	public void correctPinBelowMin() {
		
		
		context.output.DisplayMenu();
   	    context.setState(context.getOverdrawnState());

	}

}
