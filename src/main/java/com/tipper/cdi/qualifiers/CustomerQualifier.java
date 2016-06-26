package com.tipper.cdi.qualifiers;

import com.tipper.cdi.enums.ECustomerType;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by thipeter on 26/06/2016.
 */
@Qualifier
@Retention(RUNTIME)
@Target({TYPE, METHOD, FIELD, PARAMETER})
public @interface CustomerQualifier {
    public ECustomerType type();
}
