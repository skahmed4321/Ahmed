package javaRevice;

public class TestSwitch {

    public static void main(String[] args) {


        String names = "rahim";

        switch (names) {
            case "jamal":
                System.out.println("jamal");
                break;
            case "kamal":
                System.out.println("kamal");
                break;
            case "rahim":
                System.out.println("rahim");
                break;
            case "Ahmed":
                System.out.println("Ahmed");
                break;
            default:
                System.out.println("not found");

        }
    }

}