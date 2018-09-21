package features_1_5.staticimports;
import static features_1_5.generics.MyClass.*;

public class StaticImportMembers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        double rand = getRandom();
        System.out.println(" User name : " + UserName);
        System.out.println(" Random number : " + rand);
    }
}
