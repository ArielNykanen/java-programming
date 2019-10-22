package com.company;

public class Main {



    public static void main(String[] args) {
        Account bobsAccount = new Account(
                "1234",
                112000.0,
                "Ariel",
                "ariel@ariel.com",
                "0343422345"
        );

        Account defAccount = new Account();

        defAccount.withDrawal(100.0);

        bobsAccount.withDrawal(100.0);
        bobsAccount.deposite(50.0);
        bobsAccount.withDrawal(100.0);
        bobsAccount.deposite(51.0);
        bobsAccount.withDrawal(100.0);

    }
}
