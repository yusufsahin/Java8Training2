package com.example;

public final class Contact {
    private final String firstName;
    private final String lastName;

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public  String toString()
    {
        return  lastName+","+firstName;
    }
}
