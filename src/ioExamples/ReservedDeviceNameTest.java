package ioExamples;

import java.io.File;

public class ReservedDeviceNameTest {
	
	private static String fileLocation = "D:/Temp/";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String newFolderName = "LPT";
		
    	boolean isProperFileName = true;
        boolean LocationCreated = false;
        boolean raLogLocationCreated = false;
        
    	File location = new File(fileLocation);        
        if(!location.exists() && location.mkdir())
        	LocationCreated = true;
        
        File raLogLocation = new File(fileLocation + File.separator + newFolderName);        
        if(!raLogLocation.exists()) {
        	//mkdir - will not create directory for reserved device names, except NUL
            if(raLogLocation.mkdir()) {
                //this check is done for reserved device name as "NUL"
            	if(raLogLocation.exists()) {
            		raLogLocationCreated = true;
            		isProperFileName = true;
            	} else {
            		isProperFileName = false;
            	}
            	//cannot create a directory with the raName.
            } else {
            	isProperFileName = false;
            }
        }
        
        //delete the folder which are created to check for reserved devices.
        if(raLogLocationCreated) raLogLocation.delete();
    	if(LocationCreated) location.delete();
    	
    	System.out.println("The Folder = " + newFolderName + " Reserverd device Name = " + isProperFileName);

	}

}
