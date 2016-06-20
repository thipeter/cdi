package com.tipper.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by thipeter on 19/06/2016.
 */
public class Main {

    public static void main(String args[]) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        AccountCaller accountCaller = container.instance().select(AccountCaller.class).get();
        accountCaller.run();
        weld.shutdown();
    }
}
