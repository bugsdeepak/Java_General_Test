package java_11_features;

import java.util.concurrent.ConcurrentHashMap;

public class RecordExample {

    //We can implement any interface AND the record has public access modifier by default
    record Employee(int id, String name, double salary) implements Runnable {

        //we can have static variables in record but no instance variable
        static double pi;
        static {
            pi = 3.14159265358979;
        }
        //below is a compilation error
        //int i = 0;

        @Override
        public void run() {
            System.out.printf("Employee %d has been recorded%n", id);
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Antony", 1200);
        Employee e2 = new Employee(2, "Benedict", 1200);
        Employee e3 = new Employee(1, "Antony", 1200);

        System.out.println( " Employee 1 equals Employee 2: " + e1.equals(e2));
        System.out.println( " Employee 1 equals Employee 3: " + e1.equals(e3));

        System.out.println(" Employee 1 Name = " +  e1.name());
        System.out.println(" Employee 1 ID = " +  e1.id());
    }
}
