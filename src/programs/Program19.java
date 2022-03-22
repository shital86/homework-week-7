package programs;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many numbers you want?");
        int n=s.nextInt();
        double[]arr=new double[n];
        System.out.println("Enter "+n+" numbers in an array");
        double sum=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextDouble();
            sum+=arr[i];
        }
        System.out.println("Average is:"+sum/n);
    }
}
