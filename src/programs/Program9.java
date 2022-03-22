package programs;
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        System.out.println("Enter any alphabet starts with 'A'TO'F' : ");
        ch = scan.next().charAt(0);

       switch (ch) {
            case 'A':
                System.out.println("Ahemdabad");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Calcutta");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Edmonton");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;

            default:
                System.out.print("Invalid");

        }


    }
}
