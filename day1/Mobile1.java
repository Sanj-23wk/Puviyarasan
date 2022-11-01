package week1.day1;

public class Mobile1 {
	 static String mobileModel="Redmi";
     static float mobileWeight=179f;  
   
    
public void sendMsg()

  {
     
	 Boolean isMobileFullCharge=true;
	 int mobileCost=14999;
	 System.out.println("is my mobile fully charged  "+isMobileFullCharge);
	 System.out.println("my mobile price is  "+mobileCost);		 
 }
public static void main(String[] args) 
{
Mobile phone = new Mobile();

System.out.println("my mobile weight is  "+mobileWeight);
System.out.println("my mobile model is "+mobileModel);
System.out.println("This is my mobile");
phone.makeCal();
phone.sendMsg();

}
}
