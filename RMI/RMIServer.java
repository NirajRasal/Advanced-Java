import java.rmi.*;
import java.rmi.Remote.*;
import java.net.*;

public class RMIServer
{
	public static void main(String args[]) throws Exception
	{
		InterestInterface i1=new InterestImpl();
		Naming.rebind("rmi//localhost:5000/hello",i1);
		System.out.println("Server connected");
	}
}
