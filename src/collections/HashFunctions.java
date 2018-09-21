package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import common.Employee;

public class HashFunctions {
    
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
        
        Set<Employee> hashset = new HashSet<Employee>();

        Employee emp1 = new Employee(10, "Antony");
        Employee emp2 = new Employee(11, "Deepak");
        Employee emp3 = new Employee(12, "Sundar");
        Employee emp4 = new Employee(11, "Deepak");
        
        //If you r storing user defined objects then you need
        //to override the equals and hashcode method to that
        //unique objects are stored in the set.
        hashset.add(emp1);
        hashset.add(emp2);
        hashset.add(emp3);
        hashset.add(emp4);
        hashset.add(emp1);
        
        System.out.println("*****************************************");
        System.out.println("HashSet Values Are");
        for(Employee emp: hashset) {
            System.out.println("Emp ID: " + emp.getEmpID() + " Emp Name : " + emp.getEmpName());
        }
        System.out.println("*****************************************");
        
        Map<Integer, String> numMap = new HashMap<Integer, String>();
        
        numMap.put(1, "One");
        numMap.put(2, "Two");
        numMap.put(3, "Three");
        //both key and value can be null
        numMap.put(null, null);
        
        //Normally the Maps (HashMap and TreeMap) are not iteratable
        //so we have get the all the keys and then use the get method
        //to get the values
        Set<Integer> set = numMap.keySet();
        
        for(Integer i: set) {
            System.out.println("The Key : " + i + " The Value : " + numMap.get(i));
        }
        
        //there is another way of getting the values from HashMap
        //that is using the Entry
        @SuppressWarnings("unused")
		Map.Entry entry = null;

        //create a hashtable instance.
        @SuppressWarnings("unused")
		Map<Integer, Employee> hashTab = new Hashtable<Integer, Employee>();
        
    }
}
