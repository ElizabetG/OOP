package com.company;
import javax.naming.Name;

public class AdminStaff extends Staff {
    public AdminStaff(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName personName, Date birthDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages) {
        super(hospital1, title, givenName, middleName, familyName, personName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
    }
}
