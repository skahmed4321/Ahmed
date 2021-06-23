package javaRevice;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {


        String yn;

        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Your First Number:");
            int firstnumber = s.nextInt();
            System.out.println("Enter Your Second Number;");
            int secondnumber = s.nextInt();
            System.out.println("select symbol(+,-,*,/)");
            String symbol = s.next();

            int result;

            switch (symbol){
                case "+":
                    result = firstnumber+secondnumber;
                    System.out.println(result);
                    break;
                case "-":
                    result = firstnumber-secondnumber;
                    System.out.println(result);
                    break;
                case "*":
                    result = firstnumber*secondnumber;
                    System.out.println(result);
                    break;
                case "/":
                    result = firstnumber/secondnumber;
                    System.out.println(result);
                    break;

                default:
                    System.out.println("invalidsymbol");
                    break;
            }

            System.out.println("do you want to continue?(press y for yes and n for no)");
            yn = s.next();
        } while (yn.equals("Y") || yn.equals("y"));

        }


    }

