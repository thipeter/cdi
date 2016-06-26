package com.tipper.cdi.entities.any.sample;

import com.tipper.cdi.interfaces.IUser;

import javax.enterprise.inject.Any;
import javax.inject.Named;

/**
 * Created by thipeter on 26/06/2016.
 */
@Named("supportUser")
@Any
public class SupportUser implements IUser {
    @Override
    public String getAccessLevel() {
        String level = "SUPPORT";
        System.out.println("The access level is: " + level);
        return level;
    }
}