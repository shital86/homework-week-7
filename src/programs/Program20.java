//Write a Java program to test if an array contains a specific value.
package programs;

public class Program20 {
    public static void main(String[] args) {
        int[]x={100,200,500,800,90,89};
        int specific_value=100;
        Program20.s1(x,specific_value);
    }

    public static void s1(int[]x,int specific_value)
    { int[] y=x;
        int z=specific_value;
        for (int i = 0;i< y.length;i++){
         //   System.out.println(""+y[i]);
            if (y[i]==z){
                System.out.println("Correct");
            }
          //  else
            //    System.out.println("Incorrect");

        }


    }
}
