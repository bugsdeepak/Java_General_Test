package main.java.features_1_5.generics;

//here T stands for Template. You can give any set of characters
class Gen<T> {
    
    T ob; // declare an object of type T

    Gen(T o) {
      ob = o;
    }

    T getob() {
      return ob;
    }

    void showType() {
      System.out.println("Type of T is " + ob.getClass().getName());
    }
}