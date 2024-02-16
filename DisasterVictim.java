package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DisasterVictim {
    private static int SOCIAL_ID_COUNTER = 0;

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int assignedSocialID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String entryDate;
    private Supply[] personalBelongings;
    private String gender;

    public DisasterVictim(String firstName, String entryDate) {
        validateDateFormat(entryDate);
        this.firstName = firstName;
        this.entryDate = entryDate;
        this.assignedSocialID = SOCIAL_ID_COUNTER++;
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
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        validateDateFormat(dateOfBirth);
        this.dateOfBirth = dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getAssignedSocialID() {
        return assignedSocialID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addPersonalBelonging(Supply supply) {
        if (personalBelongings == null) {
            personalBelongings = new Supply[]{supply};
        } else {
            List<Supply> newList = new ArrayList<>(List.of(personalBelongings));
            newList.add(supply);
            personalBelongings = newList.toArray(new Supply[0]);
        }
    }

    public void removePersonalBelonging(Supply supply) {
        if (personalBelongings != null) {
            List<Supply> newList = new ArrayList<>(List.of(personalBelongings));
            newList.remove(supply);
            personalBelongings = newList.toArray(new Supply[0]);
        }
    }

    public void addFamilyConnection(FamilyRelation familyRelation) {
        if (familyConnections == null) {
            familyConnections = new FamilyRelation[]{familyRelation};
        } else {
            List<FamilyRelation> newList = new ArrayList<>(List.of(familyConnections));
            newList.add(familyRelation);
            familyConnections = newList.toArray(new FamilyRelation[0]);
        }
    }

    public void removeFamilyConnection(FamilyRelation familyRelation) {
        if (familyConnections != null) {
            List<FamilyRelation> newList = new ArrayList<>(List.of(familyConnections));
            newList.remove(familyRelation);
            familyConnections = newList.toArray(new FamilyRelation[0]);
        }
    }

    private void validateDateFormat(String date) {
        if (!Pattern.matches("\\d{4}-\\d{2}-\\d{2}", date)) {
            throw new IllegalArgumentException("Invalid date format. Expected format: yyyy-mm-dd");
        }
    }
}
