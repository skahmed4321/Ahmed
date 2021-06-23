package javaRevice;
import java.util.Scanner;
public class ExamPractice {

    public static void main(String[] args) {

        Scanner exa = new Scanner(System.in);
        System.out.println("Login Form");
        System.out.println("..............");
        System.out.println("Enter Your First Name:");
        String firstname = exa.next();
        System.out.println("Enter Your Last Name");
        String lastname = exa.next();
        System.out.println("Enter Your Email:");
        String email = exa.next();
        System.out.println("Enter Your Phone:");
        long phone = exa.nextLong();
        System.out.println("...............");
        System.out.println("plese answer following question");
        System.out.println("Enter your first Number");
        int firstnumber = exa.nextInt();
        System.out.println("Enter your second number");
        int secondnumber = exa.nextInt();
        int sumnumber = firstnumber+secondnumber;
        int sumnumber1 = firstnumber-secondnumber;
        int sumnumber2 = firstnumber*secondnumber;
        int sumnumber3 = firstnumber/secondnumber;
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(sumnumber);
        System.out.println(sumnumber1);
        System.out.println(sumnumber2);
        System.out.println(sumnumber3);



        }

    }

