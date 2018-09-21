package common.string;

public class StrungOut {
    
    //VM is struggling to tell us is that StrungOut.main accepts an array of 
    //our String class, which has nothing whatsoever to do with java.lang.String
    public static void main(String[] args) {  //(java.lang.String[] args) {
        String s = new String("Hello world");
        System.out.println(s);
    }
}

  //Avoid reusing the names of platform classes, and never reuse class
  //names from java.lang,
    class String {
        private final java.lang.String s;
        public String(java.lang.String s) {
            this.s = s;
        }
       public java.lang.String toString() {
           return s;
       }
}
