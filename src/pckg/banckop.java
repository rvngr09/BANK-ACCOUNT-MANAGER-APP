package pckg;
// ALL THE OPERATONS POSSIBLE
public class banckop {
    public static void deposit(ACCOUNT acc, double amount) {
        if (amount > 0){
            acc.setAccbalance(acc.getaccbalance() + amount);
            System.out.printf("Deposited $%.2f\n", amount);
            System.out.println("New account balance: $" + acc.getaccbalance());
        }else {
            System.out.println("Insufficient balance to deposit");
        }
    }


    // WITHDRAWING
    public static void withdraw(ACCOUNT acc, double amount){
        if (amount > acc.getaccbalance() ){
            System.out.println("Insufficient balance to withdraw");
            System.out.println("Current account balance: " + acc.getaccbalance());
            return;
        }
        if (amount < 0 ){
            System.out.println("Insufficient balance to withdraw");
            System.out.println("Current account balance: " + acc.getaccbalance());
            return;
        }
        if (acc.getaccbalance() < acc.getpeak()){
            System.out.println("Insufficient balance to withdraw");
            System.out.println("Current account balance: " + acc.getaccbalance()+ "your floor is at" +acc.getpeak());
            return;
        }
        if (amount > 1000000){
            System.out.println("Limit reached");
            return;
        }
        acc.setAccbalance(acc.getaccbalance() - amount);
        System.out.println(STR."Withdrawed : \{amount}");
        System.out.println(STR."New account balance: \{acc.getaccbalance()}");
    }
    //TRANSFERING MONEY
    public static void transfer(ACCOUNT dest,ACCOUNT serc , double amount){
        if (amount > serc.getaccbalance() || amount < 0 ){
            System.out.println("Insufficient balance to transfer");
        }
        if (amount > 500000) {
            System.out.println("impossible transaction , LIMIT REEACHED!");
            return;
        }
        dest.setAccbalance(dest.getaccbalance()+amount);
        System.out.println("SUCCEFULLY TRANSFERRED\n");
        System.out.println(STR."New account balance of: \{dest.getaccnumber()} is =\{dest.getaccbalance()}");
        serc.setAccbalance(serc.getaccbalance()-amount);
        System.out.println(STR."New account balance of: \{serc.getaccnumber()} is =\{serc.getaccbalance()}");

    }
// COMPARING BALANCES
    public static  void compare(ACCOUNT acc1, ACCOUNT acc2){
        if (acc1.getaccbalance() > acc2.getaccbalance()){
            System.out.println("The client with the higher balance is:");
            System.out.println(acc1.getaccnumber().toString());
        }else if (acc1.getaccbalance() < acc2.getaccbalance()){
            System.out.println("The client with the lower balance is:");
            System.out.println(acc2.getaccnumber().toString());
        }else {
            System.out.println("EQUAL BALNCES");
        }

    }
// CLOSING ACCOUNT
    public static void shutdown(ACCOUNT acc){
        LIST accounts = LIST.getinstance();
        acc.setAccbalance(0);
        accounts.removeaccount(acc);
        System.out.println("ACCOUNT CLOSED SUCCEFULLY");
    }











}






