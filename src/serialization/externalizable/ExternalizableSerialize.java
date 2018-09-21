package serialization.externalizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizableSerialize {

	private static String fileName = "External.out";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Building building = new Building(12, "New Street");

		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//if you try to serialize an object which does not implement
			//Serializable interface - causes NoSerializableException
			oos.writeObject(building);
			oos.flush();
			System.out.println("Building object is written to " + fileName);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
