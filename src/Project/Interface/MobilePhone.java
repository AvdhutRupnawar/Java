package Project.Interface;

public class MobilePhone implements Telephone{
	private String phoneNumber;
	private boolean isRinging;
	

	public MobilePhone(String myNumber) {
		this.phoneNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("Desk phone is always powerd");

	}

	@Override
	public void dial(String phoneNumber) {
		System.out.println("Now Ringing " + phoneNumber + "on DeskPhone");
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the DeskPhone");
			isRinging = false;
		} else {
			System.out.println("Rhone is not Ringing");
		}
	}

	@Override
	public boolean callphone(String phoneNumber) {
		if (phoneNumber== phoneNumber) {
			isRinging = true;
			System.out.println("Phone ringing");
		}else {
			System.out.println("Phone is Not Ringing");
		}
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
