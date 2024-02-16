package edu.ucalgary.oop;


public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        validateDateFormat(dateOfInquiry);
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getLogDetails() {
        String missingPersonName;

        if (missingPerson.getLastName() != null) {
            missingPersonName = missingPerson.getFirstName() + " " + missingPerson.getLastName();
        } else {
            missingPersonName = missingPerson.getFirstName();
        }

        String logDetails = "Inquirer: " + inquirer.getFirstName() +
                ", Missing Person: " + missingPersonName +
                ", Date of Inquiry: " + dateOfInquiry +
                ", Info Provided: " + infoProvided +
                ", Last Known Location: " + lastKnownLocation.getName();

        return logDetails;
    }

    private void validateDateFormat(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid date format. Expected format: yyyy-mm-dd");
        }
    }
}
