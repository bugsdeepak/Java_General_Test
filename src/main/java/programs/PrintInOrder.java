package main.java.programs;

public class PrintInOrder {
    
    public static void main(String[] args) {
        
        int n = 6; //received from user;
        int no = 1;  //displayed
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
                System.out.print(no);
                if(j!=i){
                    System.out.print(" ");
                }
                no++;
            }
            System.out.println();
        }
    }
}
