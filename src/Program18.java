import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many numbers you want?");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter number:" + (i + 1));
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of array numbers are:"+sum);
    }

}
