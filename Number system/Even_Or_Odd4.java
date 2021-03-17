//by using array
import java.util.Scanner;
class Even_Or_Odd4{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int n = s.nextInt();
String st[] = {"Even", "Odd"};
System.out.println(n + " is " + st[n % 2]);
}
}