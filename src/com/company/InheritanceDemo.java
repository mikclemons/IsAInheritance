package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class InheritanceDemo {

    public static void main(String[] args) {

        DetroitLabber newLabber = new DetroitLabber("Mikayla", "Clemons" , "apprentice" , "1 month");
        newLabber.printLabberDetails();
        System.out.println("\n");

        Apprentice newApprentice = new Apprentice("Eta", false, "Mikayla", "Clemons", "Apprentice", "1 month");
        newApprentice.printLabberDetails();
        System.out.println("\n");


        DeveloperApprentice newDeveloperApprentice = new DeveloperApprentice(new ArrayList<String>(Arrays.asList("Java")), "Eta", false, "Mikayla", "Clemons", "Apprentice", "1 month");
        newDeveloperApprentice.printLabberDetails();
    }
}
