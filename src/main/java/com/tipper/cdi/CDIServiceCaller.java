package com.tipper.cdi;

import com.tipper.cdi.enums.ECustomerType;
import com.tipper.cdi.interfaces.IAccount;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import com.tipper.cdi.interfaces.ISearch;
import com.tipper.cdi.interfaces.IUser;
import com.tipper.cdi.qualifiers.BankOneQualifier;
import com.tipper.cdi.qualifiers.CustomerQualifier;

/**
 * Created by thipeter on 19/06/2016.
 */
public class CDIServiceCaller {

    // INJECTION WITH QUALIFIER
    @Inject
    @BankOneQualifier
    private IAccount bankOneAccount;

    // INJECTION WITH NAMED
    @Inject
    @Named("bankTwoAccount")
    private IAccount bankTwoAccount;

    // INJECTION WITH ANY
    @Inject
    private IUser user;

    // ALL Classes that extend IUsers
    @Inject
    @Any
    private Instance<IUser> users;

    @Inject
    @CustomerQualifier(type = ECustomerType.COMMON)
    private ISearch commonCustomerSearch;

    @Inject
    @CustomerQualifier(type = ECustomerType.SPECIAL)
    private ISearch specialCustomerSearch;

    protected void run () {
        printBalances();
    }

    private void printBalances() {
        System.out.println("--- INJECTION WITH QUALIFIER. ---");
        bankOneAccount.printBalance();
        System.out.println("--- INJECTION WITH @Named. ---");
        bankTwoAccount.printBalance();
        System.out.println("--- INJECTION WITH @Default. ---");
        user.getAccessLevel();
        System.out.println("--- INJECTED Instances from IUser @Any and @Default. ---");
        for(IUser user :users) {
            user.getAccessLevel();
        }
        System.out.println("--- INJECTED service for search type = COMMON. ---");
        commonCustomerSearch.search();
        System.out.println("--- INJECTED service for search type = SPECIAL. ---");
        specialCustomerSearch.search();
    }
}
