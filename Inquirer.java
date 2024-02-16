package edu.ucalgary.oop;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String SERVICES_PHONE;
    private String INFO;

    public Inquirer(String firstName, String lastName, String servicesPhoneNum, String info) {
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.SERVICES_PHONE = servicesPhoneNum;
        this.INFO = info;
    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public String getServicesPhoneNum() {
        return SERVICES_PHONE;
    }

    public String getInfo() {
        return INFO;
    }
}
