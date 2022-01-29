package com.company.tbz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class IO {
    private Validator validate = new Validator();
    private College college = new College();
    private TechnicalCollege technicalCollege = new TechnicalCollege();
    private University university = new University();
    private Major major = new Major();

    /**
     * The method run is called in the main class
     * to run the program
     */
    public void run() {
        mainMenu();
    }

    /**
     * As soon as the program starts the main menu
     * which is called in the run() method is shown
     * that gives the user the possibilities about
     * the usage
     */
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (answer != 4) {
            answer = 0;
            System.out.println("\u001B[35m                  W E L C O M E ");
            System.out.println("You just finished your apprenticeship... Now what?");
            System.out.println("This program is specifically for apprentices who have completed an apprenticeship in IT, Clerk or Retail");
            System.out.println("Press...");
            System.out.println("\u001B[34m[0] Quit");
            System.out.println("[1] View educational places");
            System.out.println("[2] View all jobs");
            System.out.println("[3] apply to study");
            System.out.println("[4] apply for job\u001B[0m");
            System.out.print("> ");
            try{
                answer = Integer.parseInt(scanner.nextLine());
                switch (answer) {
                    case 0 -> {
                        System.out.println("Thank you, Good bye :D");
                        System.exit(0);
                    }
                    case 1 -> educationMenu();
                    case 2 ->  professionMenu();
                    case 3 -> System.out.println("apply study");
                    case 4 -> System.out.println("apply job");
                    default -> System.out.println("\u001B[31mInvalid answer\u001B[0m");

                }
            }catch (NumberFormatException e){
                System.out.println("\u001B[31mOnly numbers allowed!\u001B[0m");
                mainMenu();
            }
        }
    }

    /**
     * The education menu gets called in the main menu
     * when the user chooses to see all his possibilities
     * about education after his apprenticeship.
     */
    public void educationMenu() {
        Scanner input = new Scanner(System.in);
        int answer = 0;

        while (answer != 4) {
            System.out.println("|--------------------------------------------------------------|");
            System.out.println("| [1] View all colleges     | [2] View all technical colleges |");
            System.out.println("|--------------------------------------------------------------|");
            System.out.println("| [3] View all universities | [4] Go back to previous menu     |");
            System.out.println("|--------------------------------------------------------------|");
            System.out.print("> ");

                answer = input.nextInt();
                switch (answer) {
                    case 1 -> printCollege();
                    case 2 -> printTechCollege();
                    case 3 -> printUniversities();
                    case 4 -> System.out.println("Going back");
                    default -> System.out.println("\u001B[31mNot valid answer\u001B[0m");
                }
        }
    }

    public void printMajors(){
        major.initializeMajorList();
        for (int i = 0; i < major.getMajorArrayList().size(); i++){
            System.out.println("Major: "+major.getMajorArrayList().get(i).getMajorName());
            System.out.println("Duration: "+major.getMajorArrayList().get(i).getMajorDurationInYears());
            System.out.println("School Days per week: "+major.getMajorArrayList().get(i).getNumberOfSchoolDays());
        }
    }

    public void printCollege(){
        college.initializeCollegeList();
        for (int i = 0; i < college.getCollegeArrayList().size(); i++) {
            System.out.println("Name: " +college.getCollegeArrayList().get(i).getName());
            System.out.println("Location: " +college.getCollegeArrayList().get(i).getLocation());
            System.out.println("Majors: "+college.getCollegeArrayList().get(i).getMajor());
            System.out.println("Fees: "+college.getCollegeArrayList().get(i).getFees());
            System.out.println("Available Seats: "+college.getCollegeArrayList().get(i).getAvailableSeats());
            System.out.println("Internship in last year: "+college.getCollegeArrayList().get(i).getInternship());
            System.out.println("---------------------------------------");
        }
    }

    public void printTechCollege(){
        technicalCollege.initializeTechCollegeList();
        for (int i = 0; i < technicalCollege.getTechnicalCollegeArrayList().size(); i++) {
            System.out.println("Name: " +technicalCollege.getTechnicalCollegeArrayList().get(i).getName());
            System.out.println("Location: " +technicalCollege.getTechnicalCollegeArrayList().get(i).getLocation());
            System.out.println("Majors: "+technicalCollege.getTechnicalCollegeArrayList().get(i).getMajor());
            System.out.println("Fees: "+technicalCollege.getTechnicalCollegeArrayList().get(i).getFees());
            System.out.println("Available Seats: "+technicalCollege.getTechnicalCollegeArrayList().get(i).getAvailableSeats());
            System.out.println("For Profession: "+technicalCollege.getTechnicalCollegeArrayList().get(i).getProfession());
            System.out.println("---------------------------------------");
        }
    }

    public void printUniversities(){
        university.initializeUniversityList();
        for (int i = 0; i < university.getUniversities().size(); i++) {
            System.out.println("Name: " +university.getUniversities().get(i).getName());
            System.out.println("Location: " +university.getUniversities().get(i).getLocation());
            System.out.println("Majors: "+university.getUniversities().get(i).getMajor());
            System.out.println("Fees: "+university.getUniversities().get(i).getFees());
            System.out.println("Available Seats: "+university.getUniversities().get(i).getAvailableSeats());
            System.out.println("For Profession: "+university.getUniversities().get(i).getInsurance());
            System.out.println("---------------------------------------");
        }
    }

    /**
     * This menu is shown if the user decides to
     * apply for an job after the apprenticeship
     * instead of studying. According to it's
     * preference he can choose his direction
     * which will lead him to another menu
     * showing different job directions
     */
    public void professionMenu() {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
            answer = 0;
            System.out.println("|-----------------------------------------------------|");
            System.out.println("| [1] view all IT jobs      | [2] view all Clerk Jobs |");
            System.out.println("|---------------------------------------------------- |");
            System.out.println("| [3] view all retail Jobs | [4] go back to main menu |");
            System.out.println("|-----------------------------------------------------|");
            System.out.print("> ");
            answer = Integer.parseInt(sc.nextLine());
            switch (answer) {
                case 1 -> itJobs();
                case 2 -> clerkJobs();
                case 3 -> retailJobs();
                case 4 -> System.out.println("Go back ");
                default -> System.err.println("\u001B[31mInvalid answer\u001B[0m");
            }
        } while (answer != 4);
    }

    public void itJobs() {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
            answer = 0;
            System.out.println("|------------------------------------------------------|");
            System.out.println("| [1] Application Developer | [2] Platform Developers  |");
            System.out.println("|----------------------------------------------------  |");
            System.out.println("| [3] Mediamatician         | [4] go back to main menu |");
            System.out.println("|------------------------------------------------------|");
            System.out.print("> ");
            answer = Integer.parseInt(sc.nextLine());
            switch (answer) {
                case 1 -> System.out.println("fill resume apd");
                case 2 -> System.out.println("fill resume pd");
                case 3 -> System.out.println("fill resume m");
                case 4 -> System.out.println("Go back ");
                default -> System.err.println("\u001B[31mInvalid answer\u001B[0m");
            }
        } while (answer != 4);
    }

    public void clerkJobs() {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
            answer = 0;
            System.out.println("|--------------------------------------------------|");
            System.out.println("| [1] Bank       | [2] Administration & Management |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| [3] Insurance  | [4] go back to main menu        |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("> ");
            answer = Integer.parseInt(sc.nextLine());
            switch (answer) {
                case 1 -> System.out.println("fill resume bank");
                case 2 -> System.out.println("fill resume a&m");
                case 3 -> System.out.println("fill resume insurance");
                case 4 -> System.out.println("Go back ");
                default -> System.err.println("\u001B[31mInvalid answer\u001B[0m");
            }
        } while (answer != 4);
    }

    public void retailJobs() {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
            answer = 0;
            System.out.println("|-----------------------------------------------|");
            System.out.println("| [1] Sales Retailer | [2] Consultant Retailer  |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("| [3] Sales Manager  | [4] go back to main menu |");
            System.out.println("|-----------------------------------------------|");
            System.out.print("> ");
            answer = Integer.parseInt(sc.nextLine());
            switch (answer) {
                case 1 -> System.out.println("fill resume sr");
                case 2 -> System.out.println("fill resume cr");
                case 3 -> System.out.println("fill resume sm");
                case 4 -> System.out.println("Go back ");
                default -> System.err.println("\u001B[31mInvalid answer\u001B[0m");
            }
        } while (answer != 4);
    }


}
