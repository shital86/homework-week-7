package programs;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter a number:");
        a = s.nextInt();
        String verify =(a % 2 == 0)? "Even Number" : "Odd Number";
        System.out.println("The entered number " +  a  + " is " + verify);
    }
}