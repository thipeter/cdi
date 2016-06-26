package com.tipper.cdi.entities.named.sample;

import com.tipper.cdi.interfaces.IAccount;

import javax.inject.Named;

/**
 * Created by thipeter on 19/06/2016.
 */

@Named("bankTwoAccount")
public class BankTwoAccount implements IAccount {
    @Override
    public void printBalance() {
        System.out.println("The balance for BANK TWO IS ... (@Named(\"bankTwoAccount\"))");
    }
}