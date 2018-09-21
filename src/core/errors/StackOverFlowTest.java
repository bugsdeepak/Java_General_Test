package core.errors;

public class StackOverFlowTest {

	private static int recursionCount;
	private static String myArgs [] = new String[2];
	
	static {
		myArgs[0] = new String("Antony");
		myArgs[1] = new String("Deepak");
	}
	
	public static void main(String[] args) {
		
		recursionCount++;
		
		try {
			//the below output is commented. Because it throws StackOverFlowError
			//at the count of 3621.
			//System.out.println("Recursion  Count = " + recursionCount);
			if(recursionCount == 10000)
				return;
			//Running this program muliple times throws StackOverFlowError 
			//at 5756 time, where the arguments passed is null or string arrays of size 2.
			main(myArgs);
			
		} catch (Error err) {
			System.out.println("An ERROR happaened = " + err);
			System.out.println("Recursive Count = " + recursionCount);
			err.printStackTrace();
		}

	}
}
