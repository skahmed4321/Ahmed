package javaRevice;
import java.util.Scanner;
public class Multiplication {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int fn = o.nextInt();
        System.out.println("Enter your second number");
        int sn = o.nextInt();
        System.out.println("...............");
//        System.out.println(fn);
//        System.out.println(sn);
        System.out.println("...............");
        int nummultyply = fn*sn;
        System.out.println(nummultyply);

    }
}
