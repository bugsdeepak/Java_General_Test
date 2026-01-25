/**
 * 
 */
package main.java.features_1_5.annotation.ex2;

/**
 * @author Administrator
 *
 */

@ClassComments (
		   author = "Antony",
		   date = "3/17/2002",
		   currentRevision = 6,
		   lastModified = "4/12/2004",
		   lastModifiedBy = "Sundar",
		   reviewers = {"Rajesh", "Deepak", "Muniandi"} // Note array notation
		)
public class GenerationList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("This is an example for Annotation");
	}

}
