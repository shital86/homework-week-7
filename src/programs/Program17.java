package programs;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many numbers you want?");
        int n=s.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter"+ n +"number:");
        int temp;
        for (int i =0;i< arr.length;i++) {
            arr[i] = s.nextInt();
        }
        for (int i =0;i< arr.length;i++){
            for (int j =1;j< arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println("Array after sorting:");
        for (int i=0;i< arr.length;i++)
            System.out.println(arr[i]+" ");


    }
}
