package javaRevice;
import java.util.Scanner;
public class Maruf {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter number");
        int number = m.nextInt();
        for (int n = 1; n <= 10; n++){
            System.out.println(number+"*"+n+"="+number*n);

        }


    }

}
