package serialization;

import java.io.Serializable;

public class Car implements Serializable { 
  
    /* To see the real use of this ID . Commen the following Serialize this object
     * then add new field to car and deserialize => java.io.InvalidClassException */
	public static final long serialVersionUID  = 1234234324l;
    
	//new field
	//private int carTyres ; 

    //the constructor of the class to be serialized can be private
	private Car() {
		
	}
	
	//transient and static filelds will not be serialized
    public int kmsRun;
    public static String carShop = "Ravindu";
    
    
    private int carNo;
    private int colour;
    
    //if you want to serialize an object that contains antoher object
    //that object should also implement serializable interface.    
    private Engine engine = new Engine(12,"1987");
    
    Car(int no, int color) {
        carNo = no;
        colour = color;
    }
    
    /**
     * @return the carNo
     */
    public int getCarNo() {
        return carNo;
    }
    /**
     * @param carNo the carNo to set
     */
    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }
    /**
     * @return the colour
     */
    public int getColour() {
        return colour;
    }
    /**
     * @param colour the colour to set
     */
    public void setColour(int colour) {
        this.colour = colour;
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * @return the carShop
     */
    public static String getCarShop() {
        return carShop;
    }

    /**
     * @return the kmsRun
     */
    public int getKmsRun() {
        return kmsRun;
    }

    /**
     * @param kmsRun the kmsRun to set
     */
    public void setKmsRun(int kmsRun) {
        this.kmsRun = kmsRun;
    }
}
