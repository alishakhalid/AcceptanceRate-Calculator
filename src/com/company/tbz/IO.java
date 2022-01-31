package com.company.tbz;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is the In and Output class
 * which is where we use the sout and scanner
 * functions
 */
public class IO {
    private Validator validate = new Validator();
    private College college = new College();
    private TechnicalCollege technicalCollege = new TechnicalCollege();
    private University university = new University();
    private Major major = new Major();
    private Resume resume = new Resume();
    private Skill skill = new Skill();
    private EducationResume userEducationResume = new EducationResume();
    private JobResume userJobResume = new JobResume();
    private Job job = new Job();

    /**
     * The method run is called in the main class
     * to run the program
     */
    public void run() throws IOException {
        createFileForEachResume();
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
            try {
                answer = Integer.parseInt(scanner.nextLine());
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("\u001B[31mInvalid answer\u001B[0m");
                System.out.print("> ");
                answer = Integer.parseInt(scanner.nextLine());
            }
            switch (answer) {
                case 0 -> {
                    System.out.println("Thank you, Good bye :D");
                    System.exit(0);
                }
                case 1 -> educationMenu();
                case 2 -> professionMenu();
                case 3 -> applicationToStudy();
                case 4 -> applicationToWork();
                default -> {
                    System.out.println("\u001B[31mInvalid answer");
                    System.out.println("Try again...\u001B[0m");
                }
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
            System.out.println("| [1] View all colleges     | [2] View all technical colleges  |");
            System.out.println("|--------------------------------------------------------------|");
            System.out.println("| [3] View all universities | [4] Go back to previous menu     |");
            System.out.println("|--------------------------------------------------------------|");
            System.out.print("> ");
            try {
                answer = Integer.parseInt(input.nextLine());
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("\u001B[31mInvalid answer\u001B[0m");
                System.out.print("> ");
                answer = Integer.parseInt(input.nextLine());
            }
            switch (answer) {
                case 1 -> printCollege();
                case 2 -> printTechCollege();
                case 3 -> printUniversities();
                case 4 -> System.out.println("Going back");
                default -> {
                    System.out.println("\u001B[31mInvalid answer, input must be 1, 2 or 3");
                    System.out.println("In case you would like to go back, press 4\u001B[0m");
                }
            }
        }
    }

    /**
     * This is a menu which gets called in the
     * main menu when the user decides to apply
     * to study. This menu will guide him/her through
     * and ask him/her where he/she would like to go
     * study. After this another method is called
     * asking questions to fill out resume
     */
    public void applicationToStudy() {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        System.out.println("Your choice is to go study.");
        System.out.println("Please choose in the following if you'd like to go in a\n" +
                "[0] College | [1] Technical College | [2] University");
        System.out.print("> ");
        answer = Integer.parseInt(input.nextLine());
        switch (answer) {
            case 0 -> {
                printCollege();
                System.out.println("In which College would you like to study (choose with index)");
            }
            case 1 -> {
                printTechCollege();
                System.out.println("In which Technical College would you like to study (choose with index)");
            }
            case 2 -> {
                printUniversities();
                System.out.println("In which University would you like to study (choose with index)");
            }
            default -> System.out.println("\u001B[31mNot valid answer\u001B[0m");
        }
        System.out.print("> ");
        answer = Integer.parseInt(input.nextLine());
        questionForEducationResume();
        System.exit(0);
    }

    /**
     * This is a menu which gets called in the
     * main menu when the user decides to apply
     * to work. This menu will guide him/her through
     * and ask him/her where he/she would like to
     * work. After this another method is called
     * asking questions to fill out their resume
     */
    public void applicationToWork() {
        Scanner input = new Scanner(System.in);
        int answer = 0;

            System.out.println("Your choice is to work.");
            System.out.println("Please choose in which field you want to work \n" +
                    "[0] IT | [1] Office |");
            System.out.print("> ");
            try {
                answer = Integer.parseInt(input.nextLine());
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("\u001B[31mInvalid answer\u001B[0m");
                System.out.print("> ");
                answer = Integer.parseInt(input.nextLine());
            }
            switch (answer) {
                case 0 -> {
                    job.getITJobs();
                    System.out.println("For which IT-job do want to apply for? (choose with index)");
                    System.out.print("> ");
                    answer = Integer.parseInt(input.nextLine());
                    questionForJobResume();
                    job.getJobs().get(answer);

                }
                case 1 -> {
                    job.getClerkJobs();
                    System.out.println("For which Clerk-job do want to apply for? (choose with index)");
                    System.out.print("> ");
                    answer = Integer.parseInt(input.nextLine());
                    questionForJobResume();
                }
                default -> System.out.println("\u001B[31mNot valid answer\u001B[0m");
            }

            System.exit(0);

    }

    /**
     * This method gets called in applicationToStudy.
     * It asks the user a few question to fill
     * out his/her resume which we will be comparing
     * later on with it's educational location
     */
    public void questionForEducationResume() {
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? ");
        System.out.print("> ");
        int age = input.nextInt();
        System.out.println("What is your grade point average of your Report card? ");
        System.out.print("> ");
        double gradeAverage = validate.validateGradeInput();
        System.out.print("What is your Skill? \n");
        printSkill();
        System.out.print("> ");
        String userSkill = validate.validateStringInput();
        System.out.print("What is your biggest strength (choose 1) \n");
        printStrengths();
        System.out.print("> ");
        String userStrength = validate.validateStringInput();
        System.out.print("What is your biggest weakness (choose 1) \n");
        printWeaknesses();
        System.out.print("> ");
        String userWeakness = validate.validateStringInput();
        System.out.print("Do you have a BMS diploma? \n" +
                "true | false \n");
        System.out.print("> ");
        boolean hasBMS = validate.validateBoolean();
        userEducationResume.createEducationResumeForUserToFillOut(age,
                gradeAverage, userSkill.toLowerCase(), userStrength.toLowerCase(), userWeakness.toLowerCase(), hasBMS);
        printUserEducationResume();
        calcualteAcceptanceRate(userEducationResume);
        System.out.println("Here you go");
    }
    public double calcualteAcceptanceRate(Resume resume){
        System.out.println("Calculating Acceptance Rate...");
        double acceptanceRate = 0.0;
        int counter = 0;
        return acceptanceRate;
    }
    /**
     * This method gets called in applicationToStudy.
     * It asks the user a few question to fill
     * out his/her resume which we will be comparing
     * later on with it's educational location
     */
    public void questionForJobResume() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many kilometres far do you live from this job? ");
        System.out.print("> ");
        int domicileDistance = input.nextInt();
        System.out.println("What is your grade point average of your Report card? ");
        System.out.print("> ");
        double gradeAverage = validate.validateGradeInput();
        System.out.print("What is your Skill? \n");
        printSkill();
        System.out.print("> ");
        String userSkill = validate.validateStringInput();
        System.out.print("What is your biggest strength (choose 1) \n");
        printStrengths();
        System.out.print("> ");
        String userStrength = validate.validateStringInput();
        System.out.print("What is your biggest weakness (choose 1) \n");
        printWeaknesses();
        System.out.print("> ");
        String userWeakness = validate.validateStringInput();
        System.out.print("Do you have a BMS diploma? \n" +
                "true | false \n");
        System.out.print("> ");
        boolean hasBMS = validate.validateBoolean();
        userJobResume.createJobResumeForUserToFillOut(domicileDistance,
                gradeAverage, userSkill.toLowerCase(), userStrength.toLowerCase(), userWeakness.toLowerCase(), hasBMS);
        printUserJobResume();
        System.out.println("Calculating Acceptance Rate...");
        System.out.println("Here you go");
    }

    /**
     * This method prints the resume information's
     * which the user filled to show him/her
     * it's answers
     */
    public void printUserEducationResume() {
        System.out.println("Your answers: ");
        for (int i = 0; i < userEducationResume.getUserResumeList().size(); i++) {
            System.out.println("Age: " + userEducationResume.getUserResumeList().get(i).getMinAge());
            System.out.println("Average Grade: " + userEducationResume.getUserResumeList().get(i).getAverageGrade());
            System.out.println("Your skill: " + userEducationResume.getUserResumeList().get(i).getUserSkill());
            System.out.println("Your best strength: " + userEducationResume.getUserResumeList().get(i).getStrength());
            System.out.println("Your biggest weakness: " + userEducationResume.getUserResumeList().get(i).getWeakness());
            System.out.println("Has BMS Diploma: " + userEducationResume.getUserResumeList().get(i).isHasBMSDiploma());

        }
    }
    /**
     * This method prints the resume information's
     * which the user filled to show him/her
     * it's answers
     */
    public void printUserJobResume() {
        System.out.println("Your answers: ");
        for (int i = 0; i < userJobResume.getUserResumeList().size(); i++) {
            System.out.println("Domicile Distance: " + userJobResume.getUserResumeList().get(i).getMaxDomicileDistance());
            System.out.println("Average Grade: " + userJobResume.getUserResumeList().get(i).getAverageGrade());
            System.out.println("Your skill: " + userJobResume.getUserResumeList().get(i).getUserSkill());
            System.out.println("Your best strength: " + userJobResume.getUserResumeList().get(i).getStrength());
            System.out.println("Your biggest weakness: " + userJobResume.getUserResumeList().get(i).getWeakness());
            System.out.println("Has BMS Diploma: " + userJobResume.getUserResumeList().get(i).isHasBMSDiploma());
        }
    }

    /**
     * In this method resume is filled
     * with the values of the arraylist
     * which are saved in a file with their
     * name
     */
    public void createFileForEachResume() throws IOException {
        Resume resume = new Resume();
        resume.initializeResumes();
        for (int i = 0; i < resume.getResumes().size(); i++) {
            FileHandler.addResumeToFile(resume.getResumes().get(i));
        }
    }

    /**
     * Method prints all majors
     * with it's name, duration and
     * how many days school the student
     * would have to go per week
     */
    public void printMajors() {
        major.initializeMajorList();
        for (int i = 0; i < major.getMajorArrayList().size(); i++) {
            System.out.println("Major: " + major.getMajorArrayList().get(i).getMajorName());
            System.out.println("Duration: " + major.getMajorArrayList().get(i).getMajorDurationInYears());
            System.out.println("School Days per week: " + major.getMajorArrayList().get(i).getNumberOfSchoolDays());
        }
    }

    /**
     * Method prints all skills,
     * this method is used in
     * questionForEducationResume() for the
     * user to choose his best skill
     */
    public void printSkill() {
        skill.initializeSkills();
        for (int i = 0; i < skill.getSkills().size(); i++) {
            System.out.println(skill.getSkills().get(i).getName());
        }
    }

    /**
     * Method prints all strengths,
     * that is called in
     * questionForEducationResume() for the
     * user to choose his best strength
     */
    public void printStrengths() {
        resume.addStrengths();
        for (int i = 0; i < resume.getStrengths().size(); i++) {
            System.out.println(resume.getStrengths().get(i));
        }
    }

    /**
     * Method prints all weaknesses,
     * this method is called in
     * questionForEducationResume() for the
     * user to choose his biggest weakness
     */
    public void printWeaknesses() {
        resume.addWeaknesses();
        for (int i = 0; i < resume.getWeaknesses().size(); i++) {
            System.out.println(resume.getWeaknesses().get(i));
        }
    }


    /**
     * This method prints all the Universities
     * to give the user the possibility
     * to choose where he would like to apply.
     * A university has a name, location,
     * major and it's information's,
     * fees, available seats and the
     * insurance it requires
     */
    public void printUniversities() {
        university.initializeUniversities();
        for (int i = 0; i < university.getUniversities().size(); i++) {
            System.out.print("[" + i + "] ");
            System.out.println("Name: " + university.getUniversities().get(i).getName());
            System.out.println("Location: " + university.getUniversities().get(i).getLocation());
            System.out.println("Major: " + university.getUniversities().get(i).getMajor().getMajorName());
            System.out.println("Duration: " + university.getUniversities().get(i).getMajor().getMajorDurationInYears());
            System.out.println("School Days per Week: " + university.getUniversities().get(i).getMajor().getNumberOfSchoolDays());
            System.out.println("Fees: " + university.getUniversities().get(i).getFees());
            System.out.println("Available Seats: " + university.getUniversities().get(i).getAvailableSeats());
            System.out.println("Insurance needed: " + university.getUniversities().get(i).getInsurance());
            System.out.println("---------------------------------------");
        }
    }

    /**
     * This method prints all the colleges
     * to give the user the possibility
     * to choose where he would like to apply.
     * A college has a name, location,
     * major and it's information's,
     * fees, available seats and provides
     * about the internship the student will be
     * doing in the last year
     */
    public void printCollege() {
        college.initializeColleges();
        for (int i = 0; i < college.getCollegeArrayList().size(); i++) {
            System.out.print("[" + i + "] ");
            System.out.println("Name: " + college.getCollegeArrayList().get(i).getName());
            System.out.println("Location: " + college.getCollegeArrayList().get(i).getLocation());
            System.out.println("Major: " + college.getCollegeArrayList().get(i).getMajor().getMajorName());
            System.out.println("Duration: " + college.getCollegeArrayList().get(i).getMajor().getMajorDurationInYears());
            System.out.println("School Days per Week: " + college.getCollegeArrayList().get(i).getMajor().getNumberOfSchoolDays());
            System.out.println("Fees: " + college.getCollegeArrayList().get(i).getFees());
            System.out.println("Available Seats: " + college.getCollegeArrayList().get(i).getAvailableSeats());
            System.out.println("Internship in last year as: " + college.getCollegeArrayList().get(i).getInternship());
            System.out.println("------------------------------------------------------------");
        }
    }


    /**
     * This method prints all the technical
     * colleges to give the user the possibility
     * to choose where he would like to apply.
     * A college has a name, location,
     * major and it's information's,
     * fees, available seats and for which profession
     * it's suitable
     */
    public void printTechCollege() {
        technicalCollege.initializeTechnicalColleges();
        for (int i = 0; i < technicalCollege.getTechnicalCollegeArrayList().size(); i++) {
            System.out.print("[" + i + "] ");
            System.out.println("Name: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getName());
            System.out.println("Location: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getLocation());
            System.out.println("Only for: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getJobOrientation());
            System.out.println("Major: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getMajor().getMajorName());
            System.out.println("Duration: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getMajor().getMajorDurationInYears());
            System.out.println("School Days per Week: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getMajor().getNumberOfSchoolDays());
            System.out.println("Fees: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getFees());
            System.out.println("Available Seats: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getAvailableSeats());
            System.out.println("For Profession: " + technicalCollege.getTechnicalCollegeArrayList().get(i).getProfession());
            System.out.println("------------------------------------------------------------");
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
        int answer = 0;

        while (answer != 3) {
            System.out.println("|-----------------------------------------------------|");
            System.out.println("| [1] view all IT jobs      | [2] view all Clerk Jobs |");
            System.out.println("|---------------------------------------------------- |");
            System.out.println("| [3] go back to main menu  |                         |");
            System.out.println("|-----------------------------------------------------|");
            System.out.print("> ");
            try {
                answer = Integer.parseInt(sc.nextLine());
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("\u001B[31mInvalid answer\u001B[0m");
                System.out.print("> ");
                answer = Integer.parseInt(sc.nextLine());
            }
            switch (answer) {
                case 1 -> job.getITJobs();
                case 2 -> job.getClerkJobs();
                case 3 -> System.out.println("Go back ");
                default -> System.out.println("\u001B[31mInvalid answer\u001B[0m");
            }
        }
    }
}
