package aditya;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner

        System.out.println("program working!!!!!"); //"program working"

        System.out.println("javaW"); //"javaW"

        System.out.println("enter decimel");

        float number = scanner.nextFloat(); // activates input

        System.out.println("yoar number is: " + number);

        scanner.nextLine();

        System.out.println("sealing of ur number: " + Math.ceil(number)); // ceiling
        System.out.println("round of ur number: " + Math.round(number)); // round
        System.out.println("floor of ur number: " + Math.floor(number)); // floor of decimal

        System.out.println("type smth");

        String ster = scanner.nextLine();

        System.out.println("you entered: " + ster);
    }
}