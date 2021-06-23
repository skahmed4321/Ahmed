package javaRevice;
import java.util.Scanner;
public class UserNamepractice2 {

    public static void main(String[] args) {

        Scanner d = new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String firstname = d.next();
        System.out.println("Enter Your Last Name:");
        String lastname = d.next();
        System.out.println("Enter Your Age:");
        int age = d.nextInt();
        System.out.println("Enter Your Phone no:");
        long phoneno = d.nextLong();
        System.out.println("Enter Your blood group:");
        char bloodgroup = d.next().charAt(0);
        System.out.println("Enter Your bloodgroup symbol");
        char symbol = d.next().charAt(0);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(phoneno);
        System.out.println(bloodgroup+""+symbol);

    }
}
