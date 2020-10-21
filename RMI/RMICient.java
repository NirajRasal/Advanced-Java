import java.rmi.*;
import java.rmi.Remote.*;
import java.net.*;
import java.util.*;

public class RMICient
{
	public static void main(String args[]) throws Exception
	{
		float rate;
		int time,principal;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal amount");
		principal=sc.nextInt();
		System.out.println("rnter rate of interest");
		rate=sc.nextFloat();
		System.out.println("enter time period(years)");
		time=sc.nextInt();
		InterestInterface i2=(InterestInterface)Naming.lookup("rmi//localhost:5000/hello");
		float interest=i2.callnterest(principal,rate,time);
		System.out.println("interset is"+interest);
	}
}