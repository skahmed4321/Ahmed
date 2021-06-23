package javaRevice;
import java.util.Scanner;
public class UserNamePractice {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter Name First Char:");
        char f = a.next().charAt(0);
        System.out.println("Enter Name Second Char:");
        char s = a.next().charAt(0);
        System.out.println(f+""+s+"");

    }
}

//    Scanner n = new Scanner(System.in);
//        System.out.println("Enter name first character:");
//                char a = n.next().charAt(0);
//                System.out.println("Enter name second character:");
//                char b = n.next().charAt(0);
//                System.out.println("Enter name third character:");
//                char c = n.next().charAt(0);
//                System.out.println("Enter name forth character:");
//                char d = n.next().charAt(0);
//                System.out.println("Enter name fifth character:");
//                char e = n.next().charAt(0);
//                //System.out.printf("%c%c%c%c%c\n",a,b,c,d,e);
//                System.out.println(a+""+b+""+c+""+d+""+e);
//
