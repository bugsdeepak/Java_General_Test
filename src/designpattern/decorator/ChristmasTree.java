package designpattern.decorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EventListener;

public class ChristmasTree {
	
	private Branch branch = new Branch(); 
	
	public Branch getBranch() {
		return branch;
	}
	
	public static void main(String[] args) {
		
		//decorator and other patterns in core java classes
		try {
			//decorator
			FileWriter fw = new FileWriter(new File(""));
			BufferedWriter bw = new BufferedWriter(fw);
			
			//Builder
			StringBuilder sb = new StringBuilder();
			
			//Singleton
			Runtime.getRuntime();
			
			//Observer or Listener - Used in JMS also
			EventListener listner = null; //Used in Swing, ButtonClickEventListener
			/* interface MessageListener {
				void onMessgae(Message msg);
			} */
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

class Branch {
	
	private String str = "Branch ";
	
	public void put(String s){
		str = str + " with " + s;
	}
	
	public String getDeocratedBranch() {
		return str;
	}
}
