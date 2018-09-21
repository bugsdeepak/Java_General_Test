package hashcode;

import java.util.*;

public class Name {
    private final String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Name))
            return false;
        Name n = (Name) o;
        return n.first.equals(first) && n.last.equals(last);
    }
    
    //if the hashCode method is commented. then, 
    //we will get the output as false. General contract - when ever you 
    //override equals you need to override hashCode also.
    public int hashCode() {
        return 37 * first.hashCode() + last.hashCode();
        }

    public static void main(String[] args) {
        Set<Name> s = new HashSet<Name>();
        s.add(new Name("Mickey", "Mouse"));
        System.out.println(s.contains(new Name("Mickey", "Mouse")));
    }
}
