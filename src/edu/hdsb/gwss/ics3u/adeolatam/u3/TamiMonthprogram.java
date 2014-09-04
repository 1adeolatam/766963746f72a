/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1adeolatam
 */
public class TamiMonthprogram {

    /**
     * @param args the command line arguments
     */
    static int FIRST_NAME = 0;
    static int LAST_NAME = 1;
    static int TOTAL_NUMBER_STUDENTS = 4;
    static int TOTAL_NUMBER_COURSES = 5;
    static int COURSE_INDEX1 = 2;
    static int COURSE_INDEX2 = 3;
    static int COURSE_INDEX3 = 4;
    static int COURSE_INDEX4 = 5;
    static int COURSE_INDEX5 = 6;
    static int INDEX_MARK1 = 0;
    static int INDEX_MARK2 = 1;
    static int INDEX_MARK3 = 2;
    static int INDEX_MARK4 = 3;
    static int INDEX_MARK5 = 4;
    static int STUDENT_INDEX;
    static String[] columnHeadings;
    static String[][] studentInfo;
    static int[][] studentMarks = new int[4][5];
    static double[] average = new double[4];

    public static void main(String[] args) throws Exception {
        studentInfo = new String[4][2];
        readFile();
        displayMenu();
    }

    public static void readFile() throws Exception {
        //Reads the lines of the file
        File file = new File("Markbook.txt");
        Scanner input = new Scanner(file);
        String lineEntered;
        StringTokenizer st;
        lineEntered = input.nextLine().trim();
        st = new StringTokenizer(lineEntered, ", ");
        // First Line; Headings
        columnHeadings = new String[7];
        int heading = 0;
        // sorts the headings of the arrays
        while (st.hasMoreTokens()) {
            columnHeadings[heading] = st.nextToken();
            heading++;
        }
        // sets the information into the respective arrays
        int student = 0;
        while (input.hasNext()) {
            lineEntered = input.nextLine().trim();
            st = new StringTokenizer(lineEntered, ", ");
            studentInfo[student][FIRST_NAME] = st.nextToken();
            studentInfo[student][LAST_NAME] = st.nextToken();
            studentMarks[student][INDEX_MARK1] = Integer.parseInt(st.nextToken());
            studentMarks[student][INDEX_MARK2] = Integer.parseInt(st.nextToken());
            studentMarks[student][INDEX_MARK3] = Integer.parseInt(st.nextToken());
            studentMarks[student][INDEX_MARK4] = Integer.parseInt(st.nextToken());
            studentMarks[student][INDEX_MARK5] = Integer.parseInt(st.nextToken());
            student++;
        }
    }

    public static void writeFile() throws Exception {
        {// writes to the file / saves 
            File file = new File("Markbook.txt");
            PrintWriter output = new PrintWriter(file);
            for (int student = 0; student < columnHeadings.length; student++) {
                output.write(columnHeadings[student]);
                output.write(",");
            }
            for (int student = 0; student < TOTAL_NUMBER_STUDENTS; student++) {
                output.println();
                output.write(studentInfo[student][FIRST_NAME] + "," + studentInfo[student][LAST_NAME] + ",");
                for (int mark = 0; mark < studentMarks.length + 1; mark++) {
                    output.print(studentMarks[student][mark] + ",");
                }

            }
            output.close();
        }

    }

    // displays the current markbook with grades and marks
    public static void displayFile() {
        for (int course = 0; course < columnHeadings.length; course++) {
            System.out.format("%-12s", columnHeadings[course]);
        }
        System.out.println();
        for (int student = 0; student < studentMarks.length; student++) {
            System.out.format("%-10s %-15s", studentInfo[student][FIRST_NAME], studentInfo[student][LAST_NAME]);
            for (int mark = 0; mark < studentMarks.length + 1; mark++) {
                System.out.format("%-12d", studentMarks[student][mark]);
            }
            System.out.println("\n");
        }
    }

    public static void sortMaxmarkOfCourse(int[][] studentMarks, String[][] studentNames, int courseindex) {
        int[] tmp;
        String[] tmpStr;
        switch (courseindex) {
            // prints out which course the user is searching for so they are aware
            case 0:
                System.out.print("Sorting for highest mark of " + columnHeadings[courseindex + 2] + ".");
                System.out.println();
                break;
            case 1:
                System.out.print("Sorting for highest mark of " + columnHeadings[courseindex + 2] + ".");
                System.out.println();
                break;
            case 2:
                System.out.print("Sorting for highest mark of " + columnHeadings[courseindex + 2] + ".");
                System.out.println();
                break;
            case 3:
                System.out.print("Sorting for highest mark of " + columnHeadings[courseindex + 2] + ".");
                System.out.println();
                break;
            case 4:
                System.out.print("Sorting for highest mark of " + columnHeadings[courseindex + 2] + ".");
                System.out.println();
                break;
            default:
                System.out.println("Please entere a valid value");
                break;
        }
// finds the lowwest mark in the specified course and puts it at the bottom
        for (int pass = 0; pass < studentMarks.length - 1; pass++) {
            int indexStudentLowestMark = 0;
            for (int student = 0; student < TOTAL_NUMBER_STUDENTS - pass; student++) {
                if (studentMarks[indexStudentLowestMark][courseindex] > studentMarks[student][courseindex]) {
                    indexStudentLowestMark = student;
                }
            }
            // SWAP
            //  The swaps between the arrays so each student has their correct marks
            tmp = studentMarks[indexStudentLowestMark];
            studentMarks[indexStudentLowestMark] = studentMarks[studentMarks.length - 1 - pass];
            studentMarks[studentMarks.length - 1 - pass] = tmp;
            tmpStr = studentNames[indexStudentLowestMark];
            studentNames[indexStudentLowestMark] = studentNames[studentMarks.length - 1 - pass];
            studentNames[studentMarks.length - 1 - pass] = tmpStr;
        }
    }

    public static void calculateStudentaverage(int[][] studentMarks, String[][] studentNames) {
        int studentSum;
        for (int student = 0; student < INDEX_MARK5; student++) {
            studentSum = 0;
            for (int course = 0; course < studentMarks[INDEX_MARK4].length; course++) {
                studentSum = studentMarks[student][course] + studentSum;
            }
            // fills in the array of the students averages so it can be displayed in other methods
            average[student] = studentSum / TOTAL_NUMBER_COURSES;
        }
    }

    public static void searchStudentmark(int searchedStudentmark, int[][] studentMarks) {
        int location = -1;// fail checking to terminate program if the searched mark can not be found
        int courselocation = 0;
        for (int student = 0; student < INDEX_MARK5; student++) {
            for (int course = 0; course < studentMarks[student].length; course++) {
                if (searchedStudentmark == studentMarks[student][course]) {
                    location = student;
                    courselocation = course;
                    course = studentMarks[student].length;
                }
            }
        }
        //Prints Heading
        for (int course = 0; course < columnHeadings.length; course++) {
            System.out.format("%-12s", columnHeadings[course]);
        }
        System.out.println();
        if (location == -1) {
            System.out.println("No one acheived the mark entered");
        }
        //Prints student name
        System.out.format("%-10s %-15s", studentInfo[location][FIRST_NAME], studentInfo[location][LAST_NAME]);
        for (int mark = 0; mark < studentMarks.length + 1; mark++) {
            System.out.format("%-12d", studentMarks[location][mark]);
        }
        System.out.println();
        // identifies the student that obtained the mark and also what course it was achieved in .
        System.out.print("The mark " + searchedStudentmark + " was obtained by " + studentInfo[location][FIRST_NAME] + " " + studentInfo[location][LAST_NAME]);
        System.out.print(" in the course " + columnHeadings[courselocation + 2]);
    }

    public static void calculateCourseaverage(int[][] studentMarks, int courseindex) {
        int courseSum = 0;
        for (int student = 0; student < TOTAL_NUMBER_STUDENTS; student++) {
            courseSum = courseSum + studentMarks[student][courseindex];
        }
        // calculates the course average of the inputed course.
        double courseAverage = courseSum / TOTAL_NUMBER_STUDENTS;
        System.out.println("The course average for " + columnHeadings[courseindex + 2] + " is " + courseAverage + "%.");
    }

    public static void sortedView(int courseID) throws Exception {

        sortMaxmarkOfCourse(studentMarks, studentInfo, courseID);
        calculateCourseaverage(studentMarks, courseID);
        System.out.print("The maximum mark of " + columnHeadings[courseID + 2] + "  is ");
        System.out.print(studentInfo[INDEX_MARK1][FIRST_NAME] + " " + studentInfo[INDEX_MARK1][LAST_NAME] + " " + studentMarks[INDEX_MARK1][courseID]);

        System.out.println();
        System.out.print("The minimum mark of " + columnHeadings[courseID + 2] + "  is ");
        System.out.print(studentInfo[studentInfo.length - 1][FIRST_NAME] + " " + studentInfo[studentInfo.length - 1][LAST_NAME] + " " + studentMarks[INDEX_MARK1][courseID]);
        System.out.println();
    }

    public static void markCriteria(double markCriteria) {
        // calls the surdent average method to determine the averages of students
        calculateStudentaverage(studentMarks, studentInfo);
        for (int course = 0; course < columnHeadings.length; course++) {
            System.out.print(columnHeadings[course] + " ");
        }
        System.out.println();
        for (int student = 0; student < INDEX_MARK5; student++) {
            // the check to determine whether or not to print the students that meet the criteria entered
            if (average[student] > markCriteria) {
                System.out.print(studentInfo[student][FIRST_NAME] + " " + studentInfo[student][LAST_NAME] + " ");
                for (int mark = 0; mark < studentMarks.length + 1; mark++) {
                    System.out.print(studentMarks[student][mark] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void displayMenu() throws Exception {
        // the menu that gives acces to all the feastures of thios program
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Hello welcome to the Halton Markbook 1.0");
        //readfile + displayfile
        System.out.println("To display the current Markbook.txt file press 1.");
        //writefile
        System.out.println("To save your current class marks list press 2.");
        //CalculateCourseaverage
        System.out.println("To find the course average press 3.");
        //sortMaxOfCourse
        System.out.println("To sort for the highest mark in a course press 4.");
        //searchStudentmark
        System.out.println("To search for a mark a student obtained press 5.");
        //calculateStudentaverage
        System.out.println("To calculate a student's average press 6.");
        System.out.println("To show all the marks that meet a mark criteria e.g honour roll press 7.");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                displayFile();
                break;
            case 2:
                writeFile();
                break;
            case 3:
                System.out.println("The course codes are 0 for Chemistry,1 for Biology,2 for Psychology, 3 for Functions, 4 for English. ");
                int courseChoice = input.nextInt();
                calculateCourseaverage(studentMarks, courseChoice);
                displayMenu();
                break;
            case 4:
                System.out.println("Please enter the course index");
                courseChoice = input.nextInt();
                sortedView(courseChoice);
                displayMenu();
                break;
            case 5:
                System.out.println("Please enter the mark you are looking for.");
                int searchedMark = input.nextInt();
                searchStudentmark(searchedMark, studentMarks);
                displayMenu();
                break;
            case 6:
                // displays the student code , as during file saves. new students/ marks maybe added and this will give the current student code.
                System.out.println("Student id # " + studentInfo[INDEX_MARK1][FIRST_NAME] + " " + studentInfo[INDEX_MARK1][LAST_NAME] + ": " + INDEX_MARK1);
                System.out.println("Student id # " + studentInfo[INDEX_MARK2][FIRST_NAME] + " " + studentInfo[INDEX_MARK2][LAST_NAME] + ": " + INDEX_MARK2);
                System.out.println("Student id # " + studentInfo[INDEX_MARK3][FIRST_NAME] + " " + studentInfo[INDEX_MARK3][LAST_NAME] + ": " + INDEX_MARK3);
                System.out.println("Student id # " + studentInfo[INDEX_MARK4][FIRST_NAME] + " " + studentInfo[INDEX_MARK4][LAST_NAME] + ": " + INDEX_MARK4);
                System.out.println("Please enter the students id number");
                int studentid = input.nextInt();
                calculateStudentaverage(studentMarks, studentInfo);
                displayMenu();
                break;
            case 7:
                System.out.println("Please enter the cut off mark");
                double markCriteria = input.nextDouble();
                markCriteria(markCriteria);
                displayMenu();
                break;
            default:
                System.out.println("Please entere a valid value");
                break;
        }
    }
}
