package org.pltw.examples.collegeapp2;

/**
 * Created by rshowalter on 12/7/2017.
 */
public class FamilyMember {
    private String firstName;
    private String lastName;

    public FamilyMember() {
        firstName = "Ada";
        lastName = "Lovelace";
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
