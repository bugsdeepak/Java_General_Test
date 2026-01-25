package test.java;

import junit.framework.TestCase;

/**
 * @author Antony
 *
 */
public class MyFirstTestCase extends TestCase {

	/**
	 * @param name
	 */
	public MyFirstTestCase(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Setting up.....");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Tear downing....");
	}

	/**
	 * Test method for {@link main.java.serialization.SerializeExample#main(java.lang.String[])}.
	 */
	public void testMain() {
		fail("Not yet implemented");
	}
	
	public void testSecond() {
		fail("simplly failed");
	}

}
