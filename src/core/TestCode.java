/*
 * $Id: SFCodeTemplate31.xml 67218 2009-03-18 19:07:17Z svn $
 */
package core;

import java.net.UnknownHostException;

public class TestCode {
  
  public static void main(String[] args) {
    
    String ip = "";
    try {
      ip = java.net.InetAddress.getLocalHost().toString();
    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    ip = (ip != null ? ip.substring(ip.lastIndexOf(".") + 1) : "");
    String server = ip + System.getProperties().getProperty("weblogic.system.name");

    String ts = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new java.util.Date());
    
    System.out.println( ts);
    
    String myStr = "hasdfasdf";
    System.out.println("Hello NULL TEST =  " + myStr.equals("hasdfasdf"));
    
  }
  

}
