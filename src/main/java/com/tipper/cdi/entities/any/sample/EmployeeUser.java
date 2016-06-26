package com.tipper.cdi.entities.any.sample;

import com.tipper.cdi.interfaces.IUser;

import javax.enterprise.inject.Default;
import javax.inject.Named;

/**
 * Created by thipeter on 26/06/2016.
 */
@Named("employeeUser")
@Default
public class EmployeeUser  implements IUser {
    @Override
    public String getAccessLevel() {
        String level = "EMPLOYEE";
        System.out.println("The access level is: " + level);
        return level;
    }
}