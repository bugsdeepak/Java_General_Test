package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String hostname = "localhost";
	    try {
	    	//local loopback ip
            InetAddress ia = InetAddress.getByName(hostname);
            System.out.println("Addr Details 1 = " + ia);
            System.out.println("CanonicalHostName = " + ia.getCanonicalHostName());
            System.out.println("HostName = " + ia.getHostName());
            System.out.println("HostAddress = " + ia.getHostAddress());
            
        } catch (UnknownHostException e) {
        	System.out.println("Problem 1 = " + e);
        	e.printStackTrace();
        }
        
	    try {
	    	//valid IP address avilabel in the network.
            InetAddress ia = InetAddress.getByName("192.168.35.176");
            System.out.println("Addr Details 2 = " + ia);
            System.out.println("CanonicalHostName = " + ia.getCanonicalHostName());
            System.out.println("HostName = " + ia.getHostName());
            System.out.println("HostAddress = " + ia.getHostAddress());
            
            //output is 
            //Addr Details 2 = /192.168.35.176
            ///CanonicalHostName = blrd1419.hitachitest.com
            //HostName = blrd1419.hitachitest.com
            //HostAddress = 192.168.35.176
            
            
        } catch (UnknownHostException e) {
        	System.out.println("Problem 2 = " + e);
        	e.printStackTrace();
        }
        
	    try {
	    	//Localhost address details.
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println("Addr Details 3 = " + ia);
            System.out.println("CanonicalHostName = " + ia.getCanonicalHostName());
            System.out.println("HostName = " + ia.getHostName());
            System.out.println("HostAddress = " + ia.getHostAddress());
        } catch (UnknownHostException e) {
        	System.out.println("Problem 3 = " + e);
        	e.printStackTrace();
        }
        
	    try {
	    	//INVALID IP address NOT avilable in the network.
            InetAddress ia = InetAddress.getByName("192.168.175.176");
            System.out.println("Addr Details 4 = " + ia);
            //since the IP address structure is valid there is no UnknowHostName Exception
            //But the following code hangs for some time since, (I think) it tries to connect 
            //to the IP address and after timeout. The same value printed.
            System.out.println("CanonicalHostName = " + ia.getCanonicalHostName());
            System.out.println("HostName = " + ia.getHostName());
            System.out.println("HostAddress = " + ia.getHostAddress());
            //output is
            //Addr Details 4 = /192.168.175.176
            //CanonicalHostName = 192.168.175.176
            //HostName = 192.168.175.176
            //HostAddress = 192.168.175.176
            
        } catch (UnknownHostException e) {
        	System.out.println("Problem 4 = " + e);
        	e.printStackTrace();
        }
        
        //chcecking with IP 127.2.5.1
        //(I think)any IP starting with 127 is considered as local loopback IP 127.0.0.1
        //try ping 127.2.5.12        
        try {
	    	//Localhost address details.
            InetAddress ia = InetAddress.getByName("127.2.5.1");
            System.out.println("Addr Details 5 = " + ia);
            System.out.println("CanonicalHostName = " + ia.getCanonicalHostName());
            System.out.println("HostName = " + ia.getHostName());
            System.out.println("HostAddress = " + ia.getHostAddress());
        } catch (UnknownHostException e) {
        	System.out.println("Problem 5 = " + e);
        	e.printStackTrace();
        }
	}
}
