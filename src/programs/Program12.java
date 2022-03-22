package programs;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch;
        System.out.println("Enter a character:");
        ch=s.next().charAt(0);
        System.out.println(ch>='a'&&ch<='z'?"Lowercase alphabet":ch>='A'&&ch<='Z'?"Uppercase alphabet"
                :ch>='0'&&ch<='9'?"Digit": "Symbol");
    }

}
