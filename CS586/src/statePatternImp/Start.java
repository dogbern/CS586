package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************
/*
 * Start Class
 */

//This class implements State class and defines the state Start



public class Start implements State{
	
	MDA_EFSM context = null;
	
	public Start(MDA_EFSM context){
		this.context = context;
	}
	
	//Implements only the open() method
	 public void open(){
		 
		 context.output.StoreData();
		 
		 context.setState(context.getIdleState());
		 
	 }
	 public void login(){
		 
		 
		 
	 }
	 public void logout(){
		 
		 
		 
	 }
	 public void incorrectLogin(){
		 
		 
		 
	 }
	 public void incorrectPin(int max){
		 
		 
		 
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
	 
     public void unlock(){
		 
		 
		 
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
	public void unLock() {
		
		
	}

	
	
	
	

}
