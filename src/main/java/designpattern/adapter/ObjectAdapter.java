package main.java.designpattern.adapter;

/**
 * This is an example for object Adapter.
 * Where we pass the electic socket object to the Adapter object.
 * Where we can have our own convenient method for conversion.
 * 
 * @author Antony
 *
 */
public class ObjectAdapter {

	private ElectricSocket socket;
	
	public ObjectAdapter(ElectricSocket socket) {
		this.socket = socket; 
	}
	
	public String get12Volts() {
		String converted = socket.getVolts();
		return converted + "12";
	}
	
	public String get24Volts() {
		String converted = socket.getVolts();
		return converted + "24";
	}
}
