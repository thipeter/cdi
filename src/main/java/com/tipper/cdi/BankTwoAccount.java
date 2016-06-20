package com.tipper.cdi;

import javax.inject.Named;

/**
 * Created by thipeter on 19/06/2016.
 */

@Named("bankTwoAccount")
public class BankTwoAccount implements Account{
    @Override
    public void printBalance() {
        System.out.println("The balance for BANK TWO IS ...");
    }
}