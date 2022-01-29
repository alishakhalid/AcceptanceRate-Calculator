package com.company.tbz;

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
