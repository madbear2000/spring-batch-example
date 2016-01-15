package com.example;



public class Person {
    private String lastName;
    private String firstName;
    private String LocalDateTime = "LL";
    
    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setLocalDateTime(String localDateTime) {
		this.LocalDateTime = localDateTime;
	}

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", Time: " +LocalDateTime;
    }
}