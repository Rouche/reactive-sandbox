package com.resolutech.reactiveexamples;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by jt on 8/24/17.
 */
@Data
@AllArgsConstructor
public class PersonCommand {

    private String firstName;
    private String lastName;

    public PersonCommand(Person person) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
    }

    public String sayMyName(){
        return "My Name is " + firstName + " " + lastName + ".";
    }
}
