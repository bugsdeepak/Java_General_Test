package common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	
	private static Properties props = new Properties();
	
	static {
		
		props.put("Name", "Antony");
		props.put("Place", "Trichy");
		props.put("BirthPlace", "Tanjur");
		props.put("Father", "Benedict");
	}
	
	@SuppressWarnings("all")
	private static byte[] storePropsInByte(Properties props) throws IOException {
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		props.store(baos, null);
		byte [] data  = baos.toByteArray();
		baos.close();
		System.out.println("The Properties passed converted into bytes :");
		for(byte b: data) 
			System.out.println(b);
		return data;
	}
	
	@SuppressWarnings("all")
	private static Properties loadBytesToProperties(byte [] data) throws IOException {
		
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		Properties tmp = new Properties();
		tmp.load(bais);
		System.out.println("The bytes passed converted into properties :");
		System.out.println(tmp);
		bais.close();
		return tmp;
	}
	
	public static void main(String[] args) throws IOException {
		
		loadBytesToProperties(storePropsInByte(props));

	}

}
