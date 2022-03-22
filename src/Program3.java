import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int roll_number, maths, science, english;
        String name;
        double div;
        Scanner in = new Scanner(System.in);
        System.out.println("Name:");
        String n = in.next();
        System.out.println("|Roll_Number of student:" + "|");
        int r = in.nextInt();
        System.out.println("|Enter maths marks:");
        int m = in.nextInt();
        System.out.println("Enter science marks:");
        int s = in.nextInt();
        System.out.println("Enter english marks:");
        int e = in.nextInt();

        //  System.out.println("Enter the marks of three subjects:\n");
        //  float maths = in.nextFloat();
        // float science = in.nextFloat();
        //float english = in.nextFloat();

        // int roll_number;
        float total;
        float percentage;
        String grade;
        //String name;

        total = m + s + e;
        percentage = (float) ((total / 300) * 100);
        if (percentage >= 80)
            grade = "Pass-A*";

        else if (percentage >= 60)
            grade = "A";


        else if (percentage >= 50)
            grade = "B";

        else if (percentage >= 35)
            grade = "C";

        else
            grade = "Fail";
        // System.out.println(roll_number);

        System.out.println("\n The total marks =" + total + "/300.0");
        System.out.println("The percentage    =" + percentage + "%");
        System.out.println("The grade         =" + grade + " ");
        System.out.println("|.........................................|");
        System.out.println("|        MARKS SHEET           |");
        System.out.println("|Name:" +       "......................................."   + n +"|");
        System.out.println("|Roll Number:" + "......................................"+ r +"|");
        System.out.println("Subject"+" ....................................... Marks");
        System.out.println("|Maths" +    ".........................................." + m +" |");
        System.out.println("|Science" + "........................................" + s +   " |");
        System.out.println("|English" + "........................................" + e +   " |");
        System.out.println("|Total:" + "........................................" + total + "|");
        System.out.println("|Percentage:" + "............................." + percentage +  "|");
        System.out.println("|Result:" + ".................................." + grade +      "|");
        System.out.println("|................................................................|");


    }
}
