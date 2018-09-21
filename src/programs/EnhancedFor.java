package programs;

import common.Employee;

import java.util.ArrayList;
import java.util.List;

public class EnhancedFor {
    
    public static void main(String[] args) {
        
        List<Employee> empList = new ArrayList<Employee>(3);
        
        Employee emp1 = new Employee(10, "Antony");
        Employee emp2 = new Employee(11, "Deepak");
        Employee emp3 = new Employee(12, "Sundar");
        
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        
        for(Employee emp : empList) {
            System.out.println("ID : " + emp.getEmpID());
        }
        
        for(Employee emp : empList) {
            emp.setEmpID(67);
        }
        
        for(Employee emp : empList) {
            System.out.println("ID : " + emp.getEmpID());
        }
    }
}
