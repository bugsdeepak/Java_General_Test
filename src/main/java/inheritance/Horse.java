package main.java.inheritance;

public class Horse extends Cattle {
    
    //the method eat() is overloaded or overridden ?
    //The method eat() is OVERRIDDEN, since all the arguments are of type Mammal.
    public void eat(Horse h) {
        System.out.println("Horse is eatting");
    }

    public static void main(String[] args) {
        
        Mammal m = new Horse();
        Cattle c = new Horse();
        //the most matched reference - method is called.
        //here the eat method of Mammal.
        c.eat(m);
        Horse horse = new Horse();
        horse.eat(c);
        
    }
}
