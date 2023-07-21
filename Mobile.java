package week1.day1;

public class Mobile {

	public void makecall() {
		System.out.println("Make a call");
		String brandName="Samsung S20 Fe 5g";
		float mobileWeight=73.50f;
		System.out.println("Brand Name:"+brandName+"\n"+"Mobile Weight:"+mobileWeight);
	}
		public void sendmsg() {
			System.out.println("Send Message");
			boolean fullyCharged= true;
			int mobileCost=49900;
			System.out.println("Fully Charged:"+fullyCharged+"\n"+"Mobile Cost:"+mobileCost);
			
	}
		

		public static void main(String[] args) {
	Mobile mob=new Mobile();
	System.out.println("This is my Moblie");
	mob.makecall();
	mob.sendmsg();
		}

}
