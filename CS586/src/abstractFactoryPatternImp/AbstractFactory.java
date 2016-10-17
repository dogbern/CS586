package abstractFactoryPatternImp;
import dataStores.*;

//**********ABSTRACT FACTORY PATTERN IMPLEMENTATION***********************

/*
 * AbstractFactory Class
 */
import strategyPatternImp.*;

public interface AbstractFactory {
	
	public DataStore createDataStore();
	public Action1 createStoreData();
	public Action2 createIncorrectIdMsg();
	public Action3 createIncorrectPinMsg();
	public Action4 createTooManyAttemptsMsg();
	public Action5 createDisplayMenu();
	public Action6 createMakeDeposit();
	public Action7 createDisplayBalance();
	public Action8 createPromptForPin();
	public Action9 createMakeWithdraw();
	public Action10 createPenalty();
	public Action11 createIncorrectLockMsg();
	public Action12 createIncorrectUnlockMsg();
	public Action13 createNoFundsMsg();
	
}
