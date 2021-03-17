import java.util.Scanner;
class Even_Or_Odd1{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int n = s.nextInt();
if (n / 2 * 2 == n)
System.out.println(n + " is even number");
else
System.out.println(n + " is odd number");
}
}