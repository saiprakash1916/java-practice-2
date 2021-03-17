//write java program to read two integer values from the user and perform all the arthemetic operations and display the output.
import java.util.Scanner;
class Arithmetic{
public static void main (String args[]){
Scanner s = new Scanner (System.in);
System.out.println("Enter any two numbers: ");
int a = s.nextInt();
int b = s.nextInt();
System.out.println(a + " + " + b + " = " + (a + b));
System.out.println(a + " - " + b + " = " + (a - b));
System.out.println(a + " * " + b + " = " + (a * b));
System.out.println(a + " / " + b + " = " + (a / b));
System.out.println(a + " % " + b + " = " + (a % b)); 
}
}