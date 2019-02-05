package com.company;

public class Apprentice extends DetroitLabber {

    private String greekClassLetter;
    private boolean isGraduated;

    public Apprentice(String greekClassLetter, boolean isGraduated, String firstName, String lastName, String jobType, String lengthOfEmployment){
        super(firstName, lastName, jobType, lengthOfEmployment);
        this.greekClassLetter  = greekClassLetter;
        this.isGraduated = isGraduated;

    }
    @Override
    public void printLabberDetails(){
        System.out.println("This apprentice is in the: " + greekClassLetter + "class and it is " + isGraduated + "that they have graduated.");
    }

}
