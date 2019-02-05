package com.company;

public class DetroitLabber {

    private String firstName;
    private String lastName;
    private String jobType;
    private String lengthOfEmployment;

    public DetroitLabber(String firstName, String lastName, String jobType, String lengthOfEmployment){
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.jobType = this.jobType;
        this.lengthOfEmployment = this.lengthOfEmployment;
    }

    public void printLabberDetails(){
        System.out.println("First Name: " + firstName +
                "last Name" + lastName +
                "Job Type: " + jobType +
                "Length of Employment: " + lengthOfEmployment);

    }
}
