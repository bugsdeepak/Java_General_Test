package main.java.programs;

import java.util.ArrayList;
import java.util.List;

public class GraphImpl {
	
	public static void main (String args[]) {
		Graph graph = new Graph();
		graph.add("chennai", "bangalore");
		graph.add("bangalore", "mumbai");
		graph.add("mumbai", "delhi");
		graph.add("vijaywada", "hydrebad");
		graph.add("hydrebad", "kolkata");
		
		System.out.println(" Chennai to Delhi = " + graph.isConnected("chennai", "delhi"));
		System.out.println(" Kolkata to Delhi = " + graph.isConnected("vijaywada", "delhi"));
		System.out.println(" Vijaywada to Vijaywada = " + graph.isConnected("vijaywada", "vijaywada"));
	}
}

/**
 * 
 * @author antbened
 *
 */
class Graph {
		
	//A table structure represents the graph
	private List<String> leftArray;
	private List<String> rightArray;
	
	public Graph() {
		leftArray = new ArrayList<String>();
		rightArray = new ArrayList<String>();
	}
	
	public void add(String left, String right) {
		if(left != null && left.length() > 0 && right != null && right.length() >0) {
			//Duplicate ==> 1. Left element found in left array And right element found in right array
			//              2. Right element found in left array And left element found in right array
			if( (leftArray.contains(left) && rightArray.contains(right)) ||
					(leftArray.contains(right) && rightArray.contains(left)) ) {
				System.out.println("Duplicate  = " + left + " : " + right);
			} else {
				leftArray.add(left);
				rightArray.add(right);
			}
		}
	}
	
	public boolean isConnected(String left, String right) {
		String curElement = left;
		int leftArrayIndx = -1;
		int rightArrayIndx = -1;
		
		//create a temporary list - leave the original table untouched
		//this is a overhead in memory but only to find two cities are connected
		List<String> tmpLeftArray = new ArrayList<String>(leftArray);
		List<String> tmpRightArray = new ArrayList<String>(rightArray);
		
		//start from left and traverse till you find right
		while(!curElement.equalsIgnoreCase(right)) {
			
			//if current element found in left array
			if(tmpLeftArray.contains(curElement)) {
				
				//then current element will be the one on its right in table
				leftArrayIndx = tmpLeftArray.indexOf(curElement);
				curElement = tmpRightArray.get(leftArrayIndx);
				
				//and remove that table entry as we have traversed it
				tmpLeftArray.remove(leftArrayIndx);
				tmpRightArray.remove(leftArrayIndx);
				
			
			//if current element found in right array
			} else if (tmpRightArray.contains(curElement)) {
				
				//then current element will be the one on its left in table
				rightArrayIndx = tmpRightArray.indexOf(curElement);
				curElement = tmpLeftArray.get(rightArrayIndx);
				
				//and remove that table entry as we have traversed it
				tmpLeftArray.remove(rightArrayIndx);
				tmpRightArray.remove(rightArrayIndx);
				
			// element not found in left array as well as right array to proceed	
			} else {
				return false;
			}
		}
		
		//while condition failed - right element found in traversal
		return true;
	}
}