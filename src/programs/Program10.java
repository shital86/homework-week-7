package programs;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        int a,b,c,ch;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number:");
        a=s.nextInt();
        System.out.println("Enter Second Number:");
        b=s.nextInt();
        System.out.println("Select from below:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your selected operation: ");
        ch =s.nextInt();
        switch (ch)
        {
            case 1:
                c=a+b;
                System.out.println("Addition = "+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction = "+c);
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication = "+c);
                break;
            case 4:
                c=a/b;
                System.out.println("Division = "+c);
                break;

        }

    }
}
