package javaRevice;
import java.util.Scanner;
public class MultificationPractise2 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");
        int number = n.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number+"*"+i+"="+number*i);
        }

    }
}
