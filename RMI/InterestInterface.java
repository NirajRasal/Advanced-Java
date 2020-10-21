import java.rmi.*;
import java.rmi.Remote.*;
import java.net.*;

public interface InterestInterface extends Remote
{
public float callnterest(int principal,float rate,int time)throws RemoteException;
}