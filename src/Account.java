/**
 * Created by bart on 08.05.16.
 */
import static java.lang.System.out;

public class Account {
    String name;
    String address;
    double balance;


    public void display(){

        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(") imeet $");
        out.print(balance);
        out.println();
    }
}
