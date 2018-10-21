package com.company;

public class Person {
    Hospital []hospital1;
    String title;
    String givenName;
    String middleName;
    String familyName;
    FullName personName;
    Date birthDate;
    Gender gender;
    Address homeAddress;
    Phone phone;

    public Person (Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName personName, Date birthDate, Gender gender, Address homeAddress, Phone phone) {
        this.hospital1 = hospital1;
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.personName = personName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    public enum Gender {
        Male, Female
    }
}
