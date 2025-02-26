package com.main.model;

public class User {
    private String firstName;
    private String lastName;

    // Default Constructor (Required for Jackson)
    public User() {}

    // Parameterized Constructor
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // toString Method (For Debugging)
    @Override
    public String toString() {
        return "User{firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}
