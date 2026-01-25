package main.java.features_1_5.annotation.ex2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Administrator
 *
 */
@Documented
@Target(ElementType.TYPE)
public @interface ClassComments {
	
	   String author();
	   String date();
	   int currentRevision() default 1;
	   String lastModified() default "N/A";
	   String lastModifiedBy() default "N/A";
	   String[] reviewers();  // Note use of array
	   
	}

