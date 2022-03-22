import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then find this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000*/
    
public class Program7 {
    private static double sales_ID;
    private static double sales_amount;
    private static String name_of_seller;
    private static double salary;
    private static int rate;
    private static double commission;


    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales_ID:");
        sales_ID = sc.nextDouble();
        System.out.println("Enter Seller's name:");
        name_of_seller = sc.next();
        System.out.println("Enter sales amount: ");
        sales_amount = sc.nextDouble();
        System.out.println("Enter basic salary:");
        salary = sc.nextDouble();
        if (sales_amount >= 50000) {
            rate = 35;
            commission = sales_amount * 0.35;

        }
        if (sales_amount >= 30000 && sales_amount <= 50000) {
            rate = 20;
            commission = sales_amount * 0.20;
        }

        if (sales_amount >= 20000 && sales_amount <= 30000) {
            rate = 10;
            commission = sales_amount * 0.10;
        }
        if (sales_amount >= 10000 && sales_amount <= 20000) {
            rate = 5;
            commission = sales_amount * 0.05;
        }
        if (sales_amount < 10000) {
            rate = 2;
            commission = sales_amount * 0.02;
        }
        System.out.println("Commission amount=" + commission);
        System.out.println(("Commission rate in %="  + rate ));

    }
}

