package com.company.tbz;

import java.util.Scanner;


public class IO {
    Validator validate = new Validator();

    /**
     * The method run is called in the main class
     * to run the program
     */
    public void run(){
    mainMenu();
   }

    /**
     * As soon as the program starts the main menu
     * which is called in the run() method is shown
     * that gives the user the possibilities about
     * the usage
     */
   public void mainMenu(){
       Scanner input = new Scanner(System.in);
       int answer = 0;
       while (answer != 5){
           System.out.println("                  W E L C O M E ");
           System.out.println("You just finished your apprenticeship... Now what?");
           System.out.println("|-----------------------------------------------------|");
           System.out.println("| [1] view all educational places | [2] view all jobs |");
           System.out.println("|---------------------------------------------------- |");
           System.out.println("| [3] apply to study              | [4] apply for job |");
           System.out.println("|---------------------------------------------------- |");
           System.out.println("| [5] Quit                                            |");
           System.out.println("|-----------------------------------------------------|");
           System.out.print("> ");
           answer = input.nextInt();
           do {
               switch (answer) {
                   case 1 -> educationMenu();
                   case 2 -> professionMenu();
                   case 3 -> System.out.println("apply to study");
                   case 4 -> System.out.println("apply for job");
                   case 5 -> System.out.println("Thank you, Good Bye :D");
                   default -> System.out.println("\u001B[31mNot valid answer\u001B[0m");
               }
           }while (answer > 5 || answer < 1);
       }
   }

    /**
     * The education menu gets called in the main menu
     * when the user chooses to see all his possibilities
     * about education after his apprenticeship.
     * */
   public void educationMenu(){
       Scanner input = new Scanner(System.in);
       int answer = 0;
       while (answer != 4) {
           System.out.println("|--------------------------------------------------------------|");
           System.out.println("| [1] view all colleges     | [2]  view all technical colleges |");
           System.out.println("|--------------------------------------------------------------|");
           System.out.println("| [3] view all universities | [4] Go back to main menu         |");
           System.out.println("|--------------------------------------------------------------|");
           System.out.print("> ");
           answer = input.nextInt();
               switch (answer) {
                   case 1 -> System.out.println("view colleges");
                   case 2 -> System.out.println("view all technical college");
                   case 3 -> System.out.println("view universities");
                   case 4 -> mainMenu();
                   default -> System.out.println("\u001B[31mNot valid answer\u001B[0m");
               }
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
    public void professionMenu(){
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
                case 1 ->
                    System.out.println("Show all IT jobs");
                case 2 ->
                    System.out.println("Show all Clerk jobs");
                case 3 ->
                    System.out.println("Show Retailer Jobs");
                case 4 ->
                    System.out.println("Go back ");
                default->
                    System.err.println("\u001B[31mInvalid answer\u001B[0m");
            }
        }while (answer != 0);
    }
}
