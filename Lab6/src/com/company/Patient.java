package com.company;

public class Patient extends Person {
    OperationStaff []operationstaff;
    String id;
    FullName pname;
    Gender pgender;
    Integer age;
    Date accepted;
    History sickness;
    String []prescriptions;
    String []allergies;
    String []specialReqs;

    public Patient(Hospital[] hospital1, String title, String givenName, String middleName, String familyName, FullName personName, Date birthDate, Gender gender, Address homeAdrress, Phone phone, OperationStaff[] ostaff, String id, FullName pname, Gender pgender, Integer age, Date accepted, History sicknes, String[] prescriptions, String[] allergies, String[] specialReqs) {
        super(hospital1, title, givenName, middleName, familyName, personName, birthDate, gender, homeAdrress, phone);
        this.operationstaff = ostaff;
        this.id = id;
        this.pname = pname;
        this.pgender = pgender;
        this.age = age;
        this.accepted = accepted;
        this.sickness = sicknes;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
    }


}
