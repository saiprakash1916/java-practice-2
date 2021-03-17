import java.util.Scanner;
class ArmStrongNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
ArmStrong as = new ArmStrong();
boolean re = as.isArmStrongNumber(a);
if (re == true)
System.out.println(a + " is a arm strong number");
else
System.out.println(a + " is not a arm strong number");
}
}