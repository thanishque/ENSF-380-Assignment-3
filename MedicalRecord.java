package edu.ucalgary.oop;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        validateDateFormat(dateOfTreatment);
        this.dateOfTreatment = dateOfTreatment;
    }

    private void validateDateFormat(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid date format: " + date);
        }
    }
}
