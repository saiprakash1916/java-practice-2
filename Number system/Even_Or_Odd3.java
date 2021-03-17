//by using ternary operator
import java.util.Scanner;
class Even_Or_Odd3{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int n = s.nextInt();
String st = (n % 2 == 0) ? "Even" : "Odd" ;
System.out.println(n + " is " + st);
}
}