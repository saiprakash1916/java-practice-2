//by using bitwise operators
import java.util.Scanner;
class Even_Or_Odd5{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int n = s.nextInt();
if ((n & 1) == 0)
System.out.println(n + " is even");
else
System.out.println(n + " is odd");
}
}