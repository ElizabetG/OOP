package com.company;

public class Surgeon extends Doctor {
    public Surgeon(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName personName, Date birthDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages, Patient[] patient2, String speciality, String locations) {
        super(hospital1, title, givenName, middleName, familyName, personName, birthDate, gender, homeAddress, phone, joined, education, certification, languages, patient2, speciality, locations);
    }
}
