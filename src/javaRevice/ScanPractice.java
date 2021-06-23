package javaRevice;
import java.util.Scanner;

public class ScanPractice {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstnum = n.nextInt();
        System.out.println("Enter your second number");
        int secondnum = n.nextInt();
        System.out.println("select symbol(+,-)");
        String symbol = n.next();

        int res;
        switch (symbol){
            case "+":
                res = firstnum+secondnum;
                System.out.println(res);
                break;
            case "-":
                res = firstnum-secondnum;
                System.out.println(res);
                break;

            default:
                System.out.println("invalid symbol");
                break;
        }
    }
}
