package pckg;
import pckg.CLIENTS;
import pckg.LIST;

import static com.sun.tools.javac.jvm.ByteCodes.illegal;

public class ACCOUNT {


    public enum type{
       COURANT , EPARGNE
    }
    private static final String BankName = "AL-BARAKA";
    private static final String AGENCY_CODE = "AGENCE-CODE-107";
    private final CLIENTS client;
    private final double accnumber;
    private final type type;
    private  double accbalance=0;
    private double peak;

    private ACCOUNT(Create creation){
        this.client = creation.client;
        this.accnumber = creation.accnumber;
        this.accbalance = creation.accbalance;
        this.peak = creation.peak;
        this.type = creation.type;

    }

    public String getbankname(){
        return BankName;
    }
    public String getagencycode(){
        return AGENCY_CODE;
    }
    public String getaccnumber(){
        return accnumber+"";
    }
    public CLIENTS getclient(){
        return client;
    }
    public double getaccbalance(){
        return accbalance;
    }
    public double getpeak(){
        return peak;
    }
    public type gettype(){
        return type;
    }
    public void setAccbalance(double accbalance){
        this.accbalance = accbalance;
    }
    public void setPeak(double peak){
        this.peak = peak;
    }
    

    static class Create{
        LIST lescomptes = LIST.getinstance();
        private CLIENTS client;
        private double accnumber;
        private double peak;
        private double accbalance;
        private type type;

        public Create setclient(CLIENTS client){
            this.client = client;
            return this;
        }
        public Create setaccnumber(double accnumber){
            this.accnumber = accnumber;
            return this;
        }
        public Create setaccbalance(double accbalance){
            this.accbalance = accbalance;
            return this;
        }
        public Create setpeak(double floor){
            this.peak = floor;
            return this;
        }
        public Create settype(type type){
            this.type = type;
            return this;
        }
        public ACCOUNT Create() {
            if (type == null  || client == null || accnumber == 0 || accbalance == 0) {
                throw new IllegalArgumentException("INVALID INFOS");
            }
            ACCOUNT account = new ACCOUNT(this);
            LIST.getinstance().addaccount(account); // Corrected usage
            return account;
        }
        @Override
        public String toString() {
            return String.format("Bank Name: " +BankName +"  Agency Code: "+AGENCY_CODE+" \n" +
                    "Client: "+client.toString()+"\n" +
                    " Account Number: " + accnumber+" Account Type: "+type.toString() +" Balance: "+ accbalance+" Limit: " +peak+"\n");
        }




    }



}
