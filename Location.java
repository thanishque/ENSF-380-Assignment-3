package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    // Constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter methods for occupants
    public ArrayList<DisasterVictim> getOccupants() {
        return occupants;
    }

    public void setOccupants(ArrayList<DisasterVictim> occupants) {
        this.occupants = occupants;
    }

    // Getter and Setter methods for supplies
    public ArrayList<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }

    // Method to add an occupant
    public void addOccupant(DisasterVictim occupant) {
        occupants.add(occupant);
    }

    // Method to remove an occupant
    public void removeOccupant(DisasterVictim occupant) {
        occupants.remove(occupant);
    }

    // Method to add a supply
    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    // Method to remove a supply
    public void removeSupply(Supply supply) {
        supplies.remove(supply);
    }
}
