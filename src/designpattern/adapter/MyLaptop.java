package designpattern.adapter;

public class MyLaptop {
	
	public static void operate() {
		
		String outFrmSckt = null;
		
		//This is my laptop. To operate, it needs a 12 volts socket
		//or else it cannot.
		ElectricSocket socket = new ElectricSocket();

		/** This is An Example for Class Adapter */
		
		//Since we have an adapter we have to call the method that converts the
		//actual output to what we needed.
		//String outFrmSckt = socket.getVolts();
		outFrmSckt = socket.convertToNeeded();
		
		/** This is An Example for Object Adapter */
		
		ObjectAdapter objAdapter = new ObjectAdapter(socket);
		outFrmSckt = objAdapter.get12Volts();
		
		
		/** This is general operation for Class and Object Adapter */
		if (outFrmSckt.contains("12")) {
			//continue to operate
			System.out.println("Got correct power i can play songs");
		} else {
			System.out.println("Improper power cannot operate");
		}
		
	}
	
	public static void main(String[] args) {
		
		MyLaptop.operate();
	}

}
