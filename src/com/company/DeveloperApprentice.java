package com.company;

import java.util.ArrayList;

public class DeveloperApprentice extends Apprentice {

    private ArrayList<String> programmingLanguages = new ArrayList<String>();

    public DeveloperApprentice(ArrayList<String> programmingLanguages, String greekClassLetter, boolean isGraduated, String firstName, String lastName, String jobType, String lengthOfEmployment){
        super(greekClassLetter, isGraduated, firstName, lastName, jobType, lengthOfEmployment);

    }

    @Override
    public void printLabberDetails(){
        System.out.println("This developer apprentice knows the following programming languages: " + programmingLanguages);


    }
}
