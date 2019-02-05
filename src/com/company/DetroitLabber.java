package com.company;

public class DetroitLabber {

    private String firstName;
    private String lastName;
    private String jobType;
    private String lengthOfEmployment;

    public DetroitLabber(String firstName, String lastName, String jobType, String lengthOfEmployment){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobType = jobType;
        this.lengthOfEmployment = lengthOfEmployment;
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

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getLengthOfEmployment() {
        return lengthOfEmployment;
    }

    public void setLengthOfEmployment(String lengthOfEmployment) {
        this.lengthOfEmployment = lengthOfEmployment;
    }

    public void printLabberDetails(){
        System.out.println("First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nJob Type: " + jobType +
                "\nLength of Employment: " + lengthOfEmployment);

    }
}
