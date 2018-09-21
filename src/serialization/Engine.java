package serialization;

import java.io.Serializable;

public class Engine implements Serializable {
    
    public static final long serialVersionUID  = 123423432423l;
    
    private int chasisNo;
    private String model;
    
    Engine() {
        chasisNo = 0;
        model="Not Known";
    }
    
    Engine(int chasis, String model) {
        chasisNo = chasis;
        this.model = model;
    }

    /**
     * @return the chasisNo
     */
    public int getChasisNo() {
        return chasisNo;
    }

    /**
     * @param chasisNo the chasisNo to set
     */
    public void setChasisNo(int chasisNo) {
        this.chasisNo = chasisNo;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

}
