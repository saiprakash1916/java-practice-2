import java.util.Scanner;
class Bigger1{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
int x = s.nextInt();
System.out.println("Enter second number: ");
int y = s.nextInt();
System.out.println("Enter third number: ");
int z = s.nextInt();
if (x > y && x > z)
System.out.println(x + " is bigger");
else if (y > z)
System.out.println(y + " is bigger");
else
System.out.println(z + " is bigger");
}
}