package pckg;

import pckg.banckop.*;
import pckg.ACCOUNT;

import java.util.Scanner;

import static pckg.banckop.*;

public class Main {
    public static void main(String[] args) {
        CLIENTS client1 = new CLIENTS("BENALLAL" , "AMINE" , "71 DIDOUCHE MOURADE" );
        ACCOUNT fstaccount = new ACCOUNT.Create()
                .setclient(client1)
                .setaccnumber(1)
                .setpeak(20)
                .settype(ACCOUNT.type.COURANT)
                .setaccbalance(10000.0)
                .Create();
        CLIENTS client2 = new CLIENTS("Nourdinne" , "mohammed" , "71 RGHAIA" );
        ACCOUNT scnaccount = new ACCOUNT.Create()
                .setclient(client2)
                .setaccnumber(2)
                .setpeak(10)
                .settype(ACCOUNT.type.EPARGNE)
                .setaccbalance(5420000.0)
                .Create();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your choice");
        System.out.println("1- ACCOUNT BALANCE \n 2- ACCOUNT DETAILS \n 3- WITHDRAW \n 4- DEPOSIT \n 5- TRANSFER");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Please enter your account number");
            int accountnumber = sc.nextInt();
            if (accountnumber == 1) {
                System.out.println( fstaccount.getaccbalance());
            }else {
                System.out.println( scnaccount.getaccbalance());
            }
        }
        if (choice == 2) {
            System.out.printf("Please enter your account number\n");
            int accountnumber = sc.nextInt();
            if (accountnumber == 1) {
                System.out.println( " ACCOUNT NUMBER : "+fstaccount.getaccnumber()+" \n NAME: "+fstaccount.getclient().getName()+"\n FIRST NAME : "+fstaccount.getclient().getFname()
                +" \n BALANCE : "+fstaccount.getaccbalance());
            }
            if (accountnumber == 2) {
                System.out.println( " ACCOUNT NUMBER : "+scnaccount.getaccnumber()+" \n NAME: "+scnaccount.getclient().getName()+"\n FIRST NAME : "+scnaccount.getclient().getFname()
                        +" \n BALANCE : "+scnaccount.getaccbalance());
            }
        }
        if (choice == 3) {
            System.out.println("Please enter your account number\n");
            int accountnumber = sc.nextInt();
            if (accountnumber == 1) {
                System.out.println("Please enter the amount you want to withdraw \n");
                int amount = sc.nextInt();
                withdraw(fstaccount,amount);
            }
            if (accountnumber == 2) {
                System.out.println("Please enter the amount you want to withdraw \n");
                int amount = sc.nextInt();
                withdraw(scnaccount,amount);
            }
        }
        if (choice == 4){
            System.out.println("Please enter your account number\n");
            int accountnumber = sc.nextInt();
            if (accountnumber == 1) {
                System.out.println("Please enter the amount you want to deposit \n");
                int amount = sc.nextInt();
                deposit(fstaccount,amount);
            }
            if (accountnumber == 2) {
                System.out.println("Please enter the amount you want to deposit \n");
                int amount = sc.nextInt();
                deposit(scnaccount, amount);
            }
        }

        if (choice == 5){
            System.out.println("Please enter your source account number\n");
            int srcnumber = sc.nextInt();
            System.out.println("Please enter your receiver account number\n");
            int receivernumber = sc.nextInt();
            System.out.println("Please enter the amount \n");
            int amount = sc.nextInt();
            if (srcnumber == 1) {
                transfer(fstaccount,scnaccount,amount);
            }
            if (receivernumber == 1) {
                transfer(scnaccount,fstaccount,amount);
            }

        }





    }





}
