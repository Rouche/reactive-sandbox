package com.resolutech.reactiveexamples;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by jt on 8/24/17.
 */
@Data
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;

    public String sayMyName() {
        return "My Name is " + firstName + " " + lastName + ".";
    }

}
