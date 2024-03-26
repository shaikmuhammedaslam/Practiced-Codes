package StudentMarks;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Percentage of a Student given by CBSE Board\n");
        System.out.println("Enter the Marks of Mathematics: ");
        int a = input.nextInt();
        System.out.println("Enter the Marks of English: ");
        int b = input.nextInt() ;
        System.out.println("Enter tge Marks of Pysics: ");
        int c = input.nextInt();
        System.out.println("Enter the Marks of Social: ");
        int d = input.nextInt();
        System.out.println("Enter the Marks of Biology: ");
        int e = input.nextInt();
        
        int result = a+b+c+d+e;
        System.out.println("Your total Marks are: " +result);
        float Total =  100*5;
        System.out.println("Out of: " +Total);
        float percentage = ((result/Total)*100);
        System.out.println("Your Percentage is: " +percentage);
    }
    
}