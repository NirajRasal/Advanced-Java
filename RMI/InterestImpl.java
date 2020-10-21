import java.rmi.*;
import java.rmi.Remote.*;
import java.net.*;
import java.rmi.server.*;

public class InterestImpl extends UnicastRemoteObject implements InterestInterface
{
	public InterestImpl() throws RemoteException
	{
		super();
	}
	public float callnterest(int principal,float rate,int time) throws RemoteException
	{
		float i=(principal*rate*time)/100;
		return i;
	}
}
		