package week1.day1;

public class Mobile {

	public void makeCal() {
		String mobileModel = "Redmi";
		float mobileWeight = 179f;
		System.out.println(mobileModel);
		System.out.println(+mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged = false;
		int mobileCost = 14999;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}
	
	public static void main(String[] args) {
		Mobile object =new Mobile();
		object.makeCal();
		object.sendMsg();
	}
}
