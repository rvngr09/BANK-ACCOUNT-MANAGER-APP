package pckg;

public class CLIENTS {
    private String name, fname, adress;

    public CLIENTS(String name, String fname, String address) {
        this.name = name;
        this.fname = fname;
        this.adress = address;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

}
