package com.tipper.cdi;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by thipeter on 19/06/2016.
 */
public class AccountCaller {

    @Inject
    @Named("bankOneAccount")
    private Account bankOneAccount;

    @Inject
    @Named("bankTwoAccount")
    private Account bankTwoAccount;

    public void run () {
        printBalances();
    }

    private void printBalances() {
        bankOneAccount.printBalance();
        bankTwoAccount.printBalance();
    }
}
