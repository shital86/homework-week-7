/*salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF*/
package programs;

import java.util.Scanner;

public class Program5 {
    public static void main(String args[]) {
        double sal,emp_ID;
        int basic;
        String e_name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee ID:");
        emp_ID = sc.nextDouble();
        System.out.println("Enter employee name:");
        e_name=sc.next();
        System.out.println("Enter basic salary:");
        basic= sc.nextInt();
        double da = 8 / 100.0 * basic;
        double hra = 10 / 100.0 * basic;
        double ta = 9 / 100.0 * basic;
        double pf=20 / 100.0* basic;
        double gross = basic + da + hra + ta -pf;
        System.out.println("|.....................................|");
        System.out.println("|            Salary Slip              |");
        System.out.println("|.....................................|");
        System.out.println("|Emlpoyee ID;                      "   +emp_ID+"|");
        System.out.println("|Emlpoyee Name=                     "   +e_name+"|");
        System.out.println("|.....................................|");
        System.out.println("|HRA  =                          "   +hra+"|");
        System.out.println("|DA=                             "   +da+"|");
        System.out.println("|TA=                             "  +ta+"|");
        System.out.println("|PF=                             " +pf+"|");
        System.out.println("|......................................|");
        System.out.println("|Gross Salary =                  "+ gross+"|");
        System.out.println("|......................................|");

    }
}
