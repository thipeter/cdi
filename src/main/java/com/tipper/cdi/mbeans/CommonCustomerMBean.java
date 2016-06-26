package com.tipper.cdi.mbeans;

import com.tipper.cdi.enums.ECustomerType;
import com.tipper.cdi.interfaces.ISearch;
import com.tipper.cdi.qualifiers.CustomerQualifier;

/**
 * Created by thipeter on 26/06/2016.
 */
@CustomerQualifier(type = ECustomerType.COMMON)
public class CommonCustomerMBean implements ISearch {
    public String search() {
        System.out.println("Searching for COMMON customer");
        return "Searching COMMON customer... ";
    }
}
