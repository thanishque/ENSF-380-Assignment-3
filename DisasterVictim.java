package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    private static int counter = 0;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = ++counter;
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

    public String getDateOfBirth() {
        return firstName;
    }

    public void setDateOfBirth(String DOB) {
        this.dateOfBirth = DOB;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    //above From FirstName to Comments


    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public String getEntryDate() {
        return ENTRY_DATE;
    }    

    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }  

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }
    
    public void setPersonalBelongings(Supply[] supplies) {
        this.personalBelongings = supplies;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }
    
    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void addPersonalBelonging(Supply supply) {
        this.personalBelongings.add(supply)
        // code to add a family connection to the familyConnections array
    }

    public void removePersonalBelonging(Supply supply) {
        this.personalBelongings.remove(supply)
        // code to remove a personal belonging from the personalBelongings array
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.add(familyConnection)
        // code to add a family connection to the familyConnections array
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.remove(familyConnection)
        // code to add a family connection to the familyConnections array
    }
    
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecords.add(medicalRecord)
        // code to add a medical record to the medicalRecords array
    }


    

    

    

}