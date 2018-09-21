package hashcode.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    
    private static void main1() {
        System.out.println("Integer");
    }
    
    public static void main1(String i) {
        System.out.println("String");
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Comand Line Argument: " + args);
        
        Set<Employee> employees = new HashSet<Employee>();
        
        Employee e1 = new Employee(11, "Antony");
        Employee e2 = new Employee(12, "Deepak");
        
        Employee e3 = new Employee(11, "Antony");
        
        System.out.println("hash code of e1 :" + e1.hashCode());
        System.out.println("hash code of e3 :" + e3.hashCode());
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for(Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
