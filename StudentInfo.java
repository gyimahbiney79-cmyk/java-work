import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[]args) {


        Scanner input = new Scanner(System.in);


        System.out.println("ENTER YOUR FULL NAME: ");
        String FullName = input.nextLine();
        System.out.println("ENTER YOUR GENDER(MALE OR FEMALE): ");
        String gender = input.nextLine();
        System.out.println("ENTER YOUR INDEX NUMBER: ");
        String IndexNum = input.next();

        System.out.println("ENTER YOUR AGE: ");
        int age = input.nextInt();
        String adultStat = (age >= 18) ? "YES" : "NO";

        System.out.println("ENTER YOUR DEPARTMENT: ");
        String depart = input.next();
        System.out.println("ENTER YOUR LEVEL: ");
        int level = input.nextInt();
        System.out.println("ENTER GPA: ");
        double gpa = input.nextDouble();

        String acadamicClass;
        if (gpa >= 3.5 && gpa > 4.0) {
            acadamicClass = "first class";
        } else if (gpa>=3.0 && gpa<3.49) {
            acadamicClass="second class upper";

        } else if (gpa>=2.5 && gpa<2.99) {
            acadamicClass="second class lower";

        }else{
            acadamicClass="Pass";
        }


        System.out.println("==STUDENT PROFILE==");
        System.out.println("NAME: " + FullName);
        System.out.println("INDEX: " + IndexNum);
        System.out.println("AGE: " + age);
        System.out.println("GENDER: "+gender.toUpperCase().charAt(0));
        System.out.println("DEPARTMENT: " + depart);
        System.out.println("LEVEL: " + level);
        System.out.println("GPA: " + gpa);


        System.out.println("  ");


        System.out.println("Adult Status: " + adultStat);
        System.out.println("Academic class: " + acadamicClass);
        System.out.println("===============");

    }









}

