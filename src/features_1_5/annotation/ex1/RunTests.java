/**
 * 
 */
package features_1_5.annotation.ex1;

import java.lang.reflect.*;

/**
 * @author deepak
 *
 */
public class RunTests {
    
    /**
     * 
     * @param args arguments.
     * @throws Exception The exception.
     */
    public static void main(String[] args) throws Exception {
    	System.out.println(" Executing Run Test ");
        int passed = 0, failed = 0;
        try {
            for (Method m : Class.forName("annotation.ex1.Foo").getMethods()) {
                if (m.isAnnotationPresent(Test.class)) {
                	
                    try {
                        m.invoke(null);
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("Test %s failed: %s %n", m, ex
                                .getCause());
                        failed++;
                    }
                }
            }
            System.out.printf("Passed: %d, Failed %d%n", passed, failed);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
            System.out.println(e.getCause());
        }
    }
}
