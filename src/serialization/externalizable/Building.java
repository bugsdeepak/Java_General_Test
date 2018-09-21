package serialization.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 
 * This class implement Externalizable so that 
 * we override two methods and we can decide how the object should be
 * serialized (The format). it give the class complete control over the format 
 * and contents of the stream for an object and its supertypes.
 * 
 * @author Antony
 *
 */
public class Building implements Externalizable {
	
	public static final long serialVersionUID  = 123423432412l;
	
	private int rooms = 0;
	private String location = "";
	
	public Building (int rooms, String location) {
		this.rooms = rooms;
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Called Write External");
		System.out.println("The actual ObjectOutput = " + out.toString()) ;
	}
	
	public void readExternal(ObjectInput in) throws IOException, ClassCastException {
		System.out.println("Called read External");
		System.out.println("");
	}
}
