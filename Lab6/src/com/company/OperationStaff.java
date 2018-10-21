package com.company;

public class OperationStaff extends Staff {
    public OperationStaff(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName personName, Date birthDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages, Patient[] patient2) {
        super(hospital1, title, givenName, middleName, familyName, personName, birthDate, gender, homeAddress, phone, joined, education, certification, languages);
        this.patient2 = patient2;
    }

    Patient [] patient2;
}
