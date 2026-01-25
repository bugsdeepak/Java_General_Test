package main.java.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CloneTest extends java.lang.Object {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("hello1");
		list.add("hello2");
		list.add("hello3");
		printElements(list);
		
		/* The ArrayList class (and most of the Collection classes) implements Cloneable 
		 * interface and overrides the clone mehthod as a  public one and does not throw any main.java.exception.
		 * Remember we cannot call the clone method if we use Generic List interface since there is no
		 * such method in the list. List list = new ArraryList(); list.clone() => The clone
		 * is undefined for the type list.
		 */
		ArrayList<String> clone = (ArrayList)list.clone();
		printElements(clone);
		
		CloneTest test = new CloneTest();
		/* Since the clone protected method in java.lang.Object throws main.java.exception
		 * we have to handle them */
		try {
			test.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	private static void printElements(List<String> eleList) {
		Iterator<String> ite = eleList.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
