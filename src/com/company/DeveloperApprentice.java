package com.company;

import java.util.ArrayList;

public class DeveloperApprentice extends Apprentice {

    private ArrayList<String> programmingLanguages = new ArrayList<String>();

    public DeveloperApprentice(ArrayList<String> programmingLanguages, String greekClassLetter, boolean isGraduated, String firstName, String lastName, String jobType, String lengthOfEmployment){
        super(greekClassLetter, isGraduated, firstName, lastName, jobType, lengthOfEmployment);
        this.programmingLanguages = programmingLanguages;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setJobType(jobType);
        this.setLengthOfEmployment(lengthOfEmployment);
        this.setGreekClassLetter(greekClassLetter);
        this.setGraduated(isGraduated);

    }


    @Override
    public void printLabberDetails(){
        System.out.println("First Name: " + getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nJob Type: " + getJobType() +
                "\nLength of Employment: " + getLengthOfEmployment() +
                "\nClass Name: " + getGreekClassLetter() + "\nGraduation Status: " + isGraduated() + "\nThis developer apprentice knows the following programming languages:\n" + this.programmingLanguages);


    }
}

