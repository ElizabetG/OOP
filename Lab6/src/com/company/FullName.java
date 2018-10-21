package com.company;

public class FullName {
    String name;
    public FullName(String givenName,String middleName, String familyName) {
        name = givenName + " " + middleName + " " + familyName;
    }
    public String FullName() {
        return name;
    }
}
