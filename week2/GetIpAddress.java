package week2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddress {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws UnknownHostException {
		InetAddress myIP = InetAddress.getLocalHost();
		
		System.out.print("My IP Address is: ");
		System.out.print(myIP.getLocalHost());

	}

}
