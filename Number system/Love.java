import java.util.Scanner;
class Love{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int a = s.nextInt();
if (a % 5 == 0 && a % 3 == 0)
System.out.println("Sanju weds Geetha");
else if (a % 5 == 0)
System.out.println("Geetha");
else if (a % 3 == 0)
System.out.println("Sanju");
else
System.out.println("Breakup");
}
}