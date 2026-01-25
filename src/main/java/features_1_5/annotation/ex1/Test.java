/**
 * 
 */
package main.java.features_1_5.annotation.ex1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author deepak
 *
 */
  
    /**
     * Indicates that the annotated method is a test method. This annotation
     * should be used only on parameterless static methods.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Test {
    }

