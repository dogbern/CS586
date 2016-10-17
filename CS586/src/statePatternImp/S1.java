package statePatternImp;

//**********STATE PATTERN IMPLEMENTATION***********************

/*
 * S1 Class
 */

//This class implements State class and defines the state S1

public class S1 implements State{
	
	MDA_EFSM context = null;
	
	public S1(MDA_EFSM context){
		
		this.context = context;
	}
	
	public void open(){
		 
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
		 
		 context.setState(context.getReadyState());
		 
	 }
	 public void noFunds(){
		 
	 }
	 public void close(){
		 
	 }
	 public void incorrectUnlock(){
		 
	 }
	 public void withdrawBelowMinBalance(){
		 
		 context.output.Penalty();
		 context.setState(context.getOverdrawnState());
		 
		 
	 }
	 public void BelowMinBalance(){
		 
		 context.setState(context.getOverdrawnState());
		 
	 }
	 public void correctPinBelowMin(){
		 
	 }

	@Override
	public void unLock() {
		// TODO Auto-generated method stub
		
	}

}
