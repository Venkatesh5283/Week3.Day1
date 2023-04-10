package week3.Day1;

public class SmartPhone extends AndroidPhone {
	
	protected void connectWhatsApp() {
		// TODO Auto-generated method stub
System.out.println("whatsapp method called");
	}

	public static void main(String[] args) {
		
SmartPhone sm=new SmartPhone();
sm.connectWhatsApp();
sm.sendMsg();
sm.makeCall();
sm.saveContact();
sm.takeVideo();
	}

}
