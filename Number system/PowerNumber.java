import java.util.Scanner;
class PowerNumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = sc.nextInt();
System.out.println("Enter the power number: ");
int b = sc.nextInt();
Power p = new Power();
int rs = p.pow(a, b);
System.out.println("power of " + a + " is " + rs);
}
}