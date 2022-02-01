package com.company.tbz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    /**
     * this method checks if the input of the user has only
     * letters, if not it will give an error to the user.
     * This method asks him / her to try again, it will ask as
     * long as the input isn't correct
     *
     * @return input
     */
    public String validateStringInput() {
        Scanner scan = new Scanner(System.in);
        Pattern p = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);

        String input = scan.nextLine();
        Matcher m = p.matcher(input);
        boolean hasCharacter = m.find();

        while (hasCharacter) {
            System.out.println("\u001B[31mInvalid answer, your answer can only contain letters\n");
            System.out.print("Try again: \u001B[0m");
            input = scan.nextLine();
            m = p.matcher(input);
            hasCharacter = m.find();
        }
        return input;
    }

    /**
     * This method checks for an input
     * which can only be a boolean
     * if not a error occurs and the user
     * is requested to try again
     *
     * @return input
     */
    public Boolean validateBoolean(){
        Scanner scan = new Scanner(System.in);
        String match= scan.nextLine().trim();
        Boolean input = Boolean.parseBoolean(match);
        while (!(match.equals("true") || match.equals("false"))) {
            System.out.println("\u001B[31mNot valid, try again: \u001B[0m");
            match = scan.nextLine();
            input = true;
        }
        return input;
    }

    public String validateSkills() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listOfSkills = new ArrayList<String>(Arrays.asList("Programming with Java","Programming with Python", "SQL", "Able to use word", "Use Excel", "Lone Worker", "Team worker", "All rounder" , "Leader"));
        String input = scan.nextLine();
        while (!listOfSkills.contains(input.trim())) {
            System.out.println("\u001B[31mInvalid answer, not on the skills list\n");
            System.out.print("Try again: \u001B[0m");
            input = scan.nextLine();
        }
        return input;
    }
    public String validateStrengths() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listOfStrengths = new ArrayList<String>(Arrays.asList("caring","self-controlled", "motivated", "fair", "dedicated" ));
        String input = scan.nextLine();
        while (!listOfStrengths.contains(input.trim())) {
            System.out.println("\u001B[31mInvalid answer, not on the strength list\n");
            System.out.print("Try again: \u001B[0m");
            input = scan.nextLine();
        }
        return input;
    }
    public String validateWeakness() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listOfWeakness = new ArrayList<String>(Arrays.asList("detail-oriented","overconfident", "insecure", "impatient", "disorganized" ));
        String input = scan.nextLine();
        while (!listOfWeakness.contains(input.trim())) {
            System.out.println("\u001B[31mInvalid answer, not on the weakness list\n");
            System.out.print("Try again: \u001B[0m");
            input = scan.nextLine();
        }
        return input;
    }

    /**
     * This method checks for an input
     * which can only be a double (decimal number)
     * if not a error occurs and the user
     * is requested to try again
     *
     * @return input
     */
    public double validateGradeInput() {
        Scanner scan = new Scanner(System.in);
        String decimalPattern = "([0-9]*)\\.([0-9]*)";
        String input = scan.nextLine();
        boolean match = Pattern.matches(decimalPattern, input);
        while (!match) {
            System.out.println("\u001B[31mNot valid, try again: \u001B[0m");
            input = scan.nextLine();
            match = true;
        }
        return Double.parseDouble(input);
    }
}
