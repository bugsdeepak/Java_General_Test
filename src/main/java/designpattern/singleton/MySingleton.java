package main.java.designpattern.singleton;

/* 1. The class has to be public so any one can access to get the singleton object 
 * Optional : the class to be final so that no one can extend */
public class MySingleton {
	
	/* 2. The Singleton object have to be private and static.   */
	private static MySingleton singleton = null;
	
	static {
		System.out.println("Static block of Singleton");
	}
	
	/* 3. The constructor have to be private otherwise classes in the same java file or package
	 * can create instance. When constructor is private no one can extend this class */
	private MySingleton() {
		System.out.println("Constructor of Singletion");
	}
	
	/* 4. public static method which should return the singleton instance */
	/* 5. We have to synchronize the lazy initialization so no two methods can access at the same time */
	public static synchronized MySingleton getMySingletonObject() {
		if (null == singleton) {
			singleton = new MySingleton();
		}
		return singleton;
	}
}