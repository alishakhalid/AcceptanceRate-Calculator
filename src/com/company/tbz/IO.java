package com.company.tbz;

import java.util.Scanner;

public class IO {
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
