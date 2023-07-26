package Project.Interface;

public interface Telephone {
	// powerOn;
	//dial a number
	//answer another phone;
	//call another phone;
	//is ringing;
	
	void powerOn();
	void dial(String phoneNumber);
	void answer();
	boolean callphone(String phoneNumber);
	boolean isRinging();
	
	

}
