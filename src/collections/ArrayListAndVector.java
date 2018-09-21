package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ArrayListAndVector {
    
    public static int main() {
        return 23;
    }
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        
        @SuppressWarnings("unused")
		List<Integer> linkedList = new LinkedList<Integer>();
        
        Integer i = new Integer(34);
        Integer j = new Integer(39);
        
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> vector = new Vector<Integer>();
        List ll = new LinkedList();
        Set s = new HashSet();
        
        s.add(i);
        s.add(j);
        
        ll.add(i);
        ll.add(j);
        
        list.add(i);
        list.add(j);
        
        vector.add(i);
        vector.add(j);
        //vector.add(null);
        
        for(Integer in: vector) {
            System.out.println(in);
        }
        
        
        //the equals and hashode method is overridden in ALL the WRAPPER classes.
        System.out.println("The Integer Objects' hashcode : " + i.hashCode());
        
        //the equals and hashcode mtheods are overridden for the entire collection.
        //to compare two collection object logically.
        //since ArrayList, LinkedList and Verctor or implementations of java.util.List
        //and they contains same values in the same order they are equal.
        if(list.equals(vector)) {
            System.out.println("Both vector and arraylist are equal");
            System.out.println("ArrayList's hashcode : " + list.hashCode());
            System.out.println("Vector's hashcode : " + vector.hashCode());
        }
        
        if(ll.equals(list)) {
            System.out.println("ArrayList and LinkedList are equal");
            System.out.println("ArrayList's hashcode : " + list.hashCode());
            System.out.println("LinkedList's hashcode : " + ll.hashCode());
        }
        
        if(s.equals(list)){
            System.out.println("Array List and HashSet are equal");
        } else {
            System.out.println("Array List and HashSet are NOT equal");
        }
    }
}
