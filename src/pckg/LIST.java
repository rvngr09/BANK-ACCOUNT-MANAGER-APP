package pckg;
import java.util.ArrayList;
public class LIST {
    private static ArrayList<ACCOUNT> accounts= new ArrayList<>();
    private static LIST instance;
    private LIST() {
        instance = this;
    }
    public static LIST getinstance() {
        if (instance == null) {
            instance = new LIST();
        }
        return instance;
    }

    //return instance == null ? new LIST() : instance;
    public  void addaccount(ACCOUNT account) {
        accounts.add(account);
    }
    public void removeaccount(ACCOUNT account) {

        accounts.remove(account);
    }
    public ArrayList<ACCOUNT> getaccounts() {
        return accounts;
    }
    public int getaccountscount() {
        return accounts.size();
    }

}

