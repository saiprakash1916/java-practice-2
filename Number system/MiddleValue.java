import java.util.Scanner;
class MiddleValue{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
int x = s.nextInt();
System.out.println("Enter second number: ");
int y = s.nextInt();
System.out.println("Enter third number: ");
int z = s.nextInt();
if (x > y && x < z || x > z && x < y)
System.out.println(x + " is middle value");
else if (y > x && y < z || y > z && y < x)
System.out.println(y + " is middle value");
else
System.out.println(z+ " is middle value");
}
}