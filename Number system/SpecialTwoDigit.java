import java.util.Scanner;
class SpecialTwoDigit{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter two digit number: ");
int a = s.nextInt();
int d1 = a/10 ;
int d2 = a%10;
int sum = (d1 + d2) + (d1 * d2);
if (sum == a)
System.out.println(a + " is a special two digit number");
else
System.out.println(a + " is a not special two digit number");
}
}