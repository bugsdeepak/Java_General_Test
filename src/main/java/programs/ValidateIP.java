package main.java.programs;

import java.util.StringTokenizer;

public class ValidateIP {
    
    
    public static boolean isIPValid(String ipStr) {
    
        //boolean validIp = true;
        StringTokenizer ipTokens = new StringTokenizer(ipStr,".");
        int octet;
        
        if (4 == ipTokens.countTokens()) {
            while (ipTokens.hasMoreElements()) {
                try {
                    octet = Integer.parseInt(ipTokens.nextToken());

                    if (!(octet > 0 && octet < 255)) {
                        return false;
                    }

                } catch (NumberFormatException nfe) {

                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        System.out.println(isIPValid("qw.121.12.qw"));
    }

}
