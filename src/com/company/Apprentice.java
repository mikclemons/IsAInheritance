package com.company;

public class Apprentice extends DetroitLabber {

    private String greekClassLetter;
    private String isGraduated;

    public Apprentice(String greekClassLetter, String isGraduated, String firstName, String lastName, String jobType, String lengthOfEmployment){
        super(firstName, lastName, jobType, lengthOfEmployment);
        this.greekClassLetter  = greekClassLetter;
        this.isGraduated = isGraduated;

    }

}
