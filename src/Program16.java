import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        number=s.nextInt();
        s.close();
        if(number>0)
            System.out.printf("%d is a Positive number",number);
        else if(number<0)
            System.out.printf("%d is a Negative number",number);
        else
            System.out.printf("%d Number is equal to Zero",number);
    }
}
