package ioExamples;

import java.io.File;

public class FileExistsTest implements NewIntf {
	
	private static String cjmsLogLocation = "D:/Test/Logs";
	
	public void newMethod() throws RuntimeException {
		
		throw new RuntimeException("");
	}
	
	
	public static void main(String[] args) {/*
		
		String raName = "LPT";
		
		boolean isRANameProperFileName = false;
        File cjmsLocation = new File(cjmsLogLocation);
        boolean cjmsLocationCreated = false;
        boolean raLogLocationCreated = false;
        
        if(!cjmsLocation.exists()) {
        	cjmsLocationCreated = true;
        	cjmsLocation.mkdir();
        }
        
        File raLogLocation = new File(cjmsLogLocation + File.separator + raName);
        if(!raLogLocation.exists()) {
        	raLogLocationCreated = true;
        	raLogLocation.mkdir();
        }
        
        //this check is done for reserved device name as "NUL"
        File tempLocation = new File(cjmsLogLocation + File.separator + raName + File.separator + "temp");
        
        if(!tempLocation.exists() && !tempLocation.mkdir()) {
        	isRANameProperFileName = false;        		       
        } else {
        	isRANameProperFileName = true;
        	tempLocation.delete();
        }
        
        if(raLogLocationCreated) raLogLocation.delete();
    	if(cjmsLocationCreated) cjmsLocation.delete();
    	
    	if(!isRANameProperFileName) {
    		//throw new ResourceAdapterInternalException("Resource Adapter cannot be started since the property 'raName' is a reserved device name.");
    	}
		
    	System.out.println("isRANameProperFileName = " + isRANameProperFileName);
	*/
		String raName = "Antt";
    	boolean isRANameProperFileName = true;
        boolean cjmsLocationCreated = false;
        boolean raLogLocationCreated = false;
        
    	File cjmsLocation = new File(cjmsLogLocation);
        
        if(!cjmsLocation.exists() && cjmsLocation.mkdir())
        	cjmsLocationCreated = true;
        
        File raLogLocation = new File(cjmsLogLocation + File.separator + raName);
        
        if(!raLogLocation.exists()) {               	
            if(raLogLocation.mkdir()) {            	
            	raLogLocationCreated = true;
                //this check is done for reserved device name as "NUL"            	
            	//File tempLocation = new File(cjmsLogLocation + File.separator + raName + File.separator + "temp");
            	
            	if(raLogLocation.exists()) {
            		isRANameProperFileName = true;
            	} else {
            		isRANameProperFileName = false;
            	}
            	
            	//if(!tempLocation.mkdir() && !tempLocation.exists()) {
            		//isRANameProperFileName = false;
            	//} else {
            		//isRANameProperFileName = true;
                   	//tempLocation.delete();
                //}
            	//cannot create a directory with the raName.
            } else {
            	isRANameProperFileName = false;
            }
        }
        
        if(raLogLocationCreated) raLogLocation.delete();
    	if(cjmsLocationCreated) cjmsLocation.delete();
    	
    	System.out.println("isRANameProperFileName = " +  isRANameProperFileName);
	}
}
