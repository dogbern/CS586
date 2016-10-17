package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * Idle Class
 */

//This class implements State class and defines the state Idle

public class Idle implements State {
	
	MDA_EFSM context = null;
	
	
	
	public Idle(MDA_EFSM context){
		
		this.context = context;
	}
	
	 public void open(){
		 
		 
	 }
	 public void login(){
		 context.attempts = 0;
		 context.output.PromptForPin();
		 context.setState(context.getCheckpinState());
		 
	 }
	 public void logout(){
		 
	 }
	 public void incorrectLogin(){
		 context.output.IncorrectIdMsg();
		 context.setState(context.getIdleState());
		 
	 }
	 public void incorrectPin(){
		 
	 }
	 public void correctPinAboveMin(){
		 
	 }
	 public void incorrectLock(){
		 
	 }
	 public void deposit(){
		 
	 }
	 public void balance(){
		 
	 }
	 public void suspend(){
		 
	 }
	 public void activate(){
		 
	 }
	 public void lock(){
		 
	 }
	 public void withdraw(){
		 
	 }
	 public void AboveMinBalance(){
		 
	 }
	 public void noFunds(){
		 
	 }
	 public void close(){
		 
	 }
	 public void incorrectUnlock(){
		 
	 }
	 public void withdrawBelowMinBalance(){
		 
	 }
	 public void BelowMinBalance(){
		 
	 }
	 public void correctPinBelowMin(){
		 
	 }
	@Override
	public void incorrectPin(int max) {
	
		
	}
	@Override
	public void unLock() {
		
		
	}

}
