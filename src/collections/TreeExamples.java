package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import common.Employee;

public class TreeExamples {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(new Integer(34));
        stack.push(null);
        stack.push(new Integer(56));
        stack.push(new Integer(6));
        
        System.out.println("Popped last element : " + stack.pop());
        
        for(Integer i: stack) {
            System.out.println("Stack Value : " + i);
        }
        
        
        Set<Integer> intSet = new TreeSet<Integer>();
        Set<Employee> empSet = new TreeSet<Employee>();
        
        Employee emp1 = new Employee(10, "Antony");
        Employee emp2 = new Employee(11, "Deepak");
        Employee emp3 = new Employee(12, "Sundar");
        Employee emp4 = new Employee(11, "Deepak");
        
        intSet.add(34);
        intSet.add(3);
        intSet.add(4);
        intSet.add(78);
        intSet.add(2);
        //we can not add a null value in the TreeSet - NullPointerException
        //intSet.add(null);
        
        //when ever you add user defined objects in the tree -
        //you have to make sure the class defines the "compareTo" (Comparable Interface)
        //method in order to sort the objects (which is the natural behaviour of trees)
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        
        
        for(Integer i: intSet) {
            System.out.println("Integer in tree set : " + i);
        }
        
        for(Employee emp: empSet) {
            System.out.println("Emp ID: " + emp.getEmpID() + " Emp Name: " + emp.getEmpName());
        }
        
        //In order to guarantee serial access, it is critical that all access to 
        //the backing collection is accomplished through the returned collection.
        Set synchSet = Collections.synchronizedSet(intSet);
        
        //It is mandatory that the user manually synchronize on the returned 
        //collection when iterating over it:
        synchronized (synchSet) {
            Iterator<Integer> it = synchSet.iterator();
            
            while (it.hasNext()){
                System.out.println(" Integer : " + it.next());
            }
        }
        
        Map<Integer, Employee> treeMap = new TreeMap<Integer, Employee>();
        
        treeMap.put(1, emp1);
        treeMap.put(2, emp2);
        treeMap.put(5, emp3);
        treeMap.put(4, emp4);
        //we can set the value as null but not the key 
        //if the key is null - NullPointerException
        treeMap.put(3, null);
        
        Set<Integer> keys = treeMap.keySet();
        
        for (Integer key: keys) {
            System.out.println("Key: " + key + " Value: " + treeMap.get(key));
        }
    }
}
