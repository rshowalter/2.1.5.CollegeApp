package org.pltw.examples.collegeapp2;

/**
 * Created by rshowalter on 12/5/2017.
 */
public class Profile {
    private String firstName;
    private String lastName;

    public Profile() {
        firstName = "Alan";
        lastName = "Turing";
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
}


