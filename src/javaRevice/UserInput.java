package javaRevice;
import java.util.Scanner;
public class UserInput {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//new object creation
        System.out.println("Enter Your Name:");
        String name = scan.next();
        System.out.println("Enter Your Phone number:");
        long phonenumber = scan.nextLong();
        System.out.println("Enter Your Age:");
        int age = scan.nextInt();
        System.out.println("Enter Your Blood group:");
        String bloodgroup = scan.next();

        System.out.println("Name:"+name);
        System.out.println(phonenumber);
        System.out.println("Age:"+age);
        System.out.println(bloodgroup);
    }


}
