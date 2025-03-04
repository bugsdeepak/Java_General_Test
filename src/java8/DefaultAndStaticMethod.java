package java8;

interface MyInterface {
    //default method which provides default behaviour
    default String sayHello() {
        return "Hello from default method";
    }

    static int add(int a, int b) {
        return a + b;
    }
}

class MyClass implements MyInterface {

    public String sayHello() {
        return "Hello from Overriden Method";
    }

    public static String add(String a, String b) {
        return a + b;
    }


}

public class DefaultAndStaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.sayHello()); // Output: Hello from default method
        System.out.println(MyInterface.add(10, 20)); // Output: 30
        System.out.println(obj.add("10", "20")); // Output: 1020
    }
}