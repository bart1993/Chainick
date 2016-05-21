/**
 * Created by bart on 08.05.16.
 */
import static java.lang.System.out;


public class useAccount {
    public static void main (String args[]) {

        Account myAccount;
        Account yourAccount;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Barry";
        myAccount.address = "222 Inner Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Djeine";
        yourAccount.address = "121 Outer Streeet";
        yourAccount.balance = 55.63;
        myAccount.display();
        out.println();
        yourAccount.display();




    }
}