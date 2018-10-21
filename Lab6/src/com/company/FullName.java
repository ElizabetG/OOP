package com.company;

public class FullName extends Person {

    public String getFullName(String givenName, String middleName, String familyName) {
        return "" + givenName + middleName + familyName;
    }
}
