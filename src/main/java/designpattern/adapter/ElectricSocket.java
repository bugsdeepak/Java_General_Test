package main.java.designpattern.adapter;

/**
 * This is an electric socket which will provide 
 * output of 240 volts as any other electric sockets in our country.
 * 
 * To make this ElectricSocket to provide the 12 volts I needed for my
 * laptop, I am changing it with an Adapter.
 * 
 * @author Antony
 */
public class ElectricSocket implements Adapter {
	
	private int voltNo = 240;
	private String voltString = "Avilable ";
	private String volts = voltString + voltNo;
	
	public String getVolts() {
		return volts;
	}
	
	public String convertToNeeded() {
		
		String converted = voltString + " 12 ";
		return converted;
	}
}
