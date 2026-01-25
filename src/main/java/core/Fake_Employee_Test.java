/*
 * $Id: SFCodeTemplate31.main.java.xml 67218 2009-03-18 19:07:17Z svn $
 */
package main.java.core;

import java.util.ArrayList;

public class Fake_Employee_Test {
  
  public static void main(String[] args) {
    /*
     * When value objects/beans/POJOs/objects represent table are created,
     * and when they are used in Collections. Its mandatory to override the
     * equals() method, and  main.java.hashcode() also. Hash code is a numerical representation
     * of the object. So funcational point is that if want to compare two objects based 
     * upon the equals() method you have to override both hashCode() and equals() methods
     * 
     */
    
    ArrayList<Fake_Employee> employees = new ArrayList<Fake_Employee>();
    Fake_Employee emp1 = new Fake_Employee(12, "Antony");
    Fake_Employee emp2 = new Fake_Employee(13, "Deepak");
    Fake_Employee emp3 = new Fake_Employee(14, "Sundar");
    Fake_Employee emp4 = new Fake_Employee(15, "Antony Deepak");
    
    employees.add(emp1);
    employees.add(emp2);
    employees.add(emp3);
    employees.add(emp4);
    
    Fake_Employee NewEmp1 = new Fake_Employee(12, "Antony");
    Fake_Employee NewEmp3 = new Fake_Employee(14, "Sundar");
    
    System.out.println("Employee strength = " + employees.size());
    System.out.println("Does the list contains Antony => " + employees.contains(NewEmp1));
    System.out.println("Going to remove Antony =>" + employees.remove(NewEmp3));
    System.out.println("Employee strength = " + employees.size());
    
    int originalHashCode = System.identityHashCode(emp1);
    System.out.println(" Original hashCode of Emp---->>>" + originalHashCode);
    
  }

}
