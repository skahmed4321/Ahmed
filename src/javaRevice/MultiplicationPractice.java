package javaRevice;
import java.util.Scanner;
public class MultiplicationPractice {
    public static void main(String[] args) {
        Scanner prac = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = prac.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num+"*"+i+"="+num*i);

        }
    }
}
