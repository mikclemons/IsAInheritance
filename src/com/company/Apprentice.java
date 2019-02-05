package com.company;

public class Apprentice extends DetroitLabber {

    private String greekClassLetter;
    private boolean isGraduated;

    public Apprentice(String greekClassLetter, boolean isGraduated, String firstName, String lastName, String jobType, String lengthOfEmployment){
        super(firstName, lastName, jobType, lengthOfEmployment);
        this.greekClassLetter  = greekClassLetter;
        this.isGraduated = isGraduated;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setJobType(jobType);
        this.setLengthOfEmployment(lengthOfEmployment);

    }

    public String getGreekClassLetter() {
        return greekClassLetter;
    }

    public void setGreekClassLetter(String greekClassLetter) {
        this.greekClassLetter = greekClassLetter;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    @Override
    public void printLabberDetails(){
        System.out.println("First Name: " + getFirstName() +
                        "\nLast Name: " + getLastName() +
                        "\nJob Type: " + getJobType() +
                        "\nLength of Employment: " + getLengthOfEmployment() +
                "\nClass Name: " + greekClassLetter + "\nGraduation Status: " + isGraduated);
    }

}
