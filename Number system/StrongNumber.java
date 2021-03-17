import java.util.Scanner;
class StrongNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int n =s.nextInt();
Strong sg = new Strong();
boolean rs = sg.isStrongNumber(n);
if (rs == true)
System.out.print(n + " is a strong number");
else
System.out.println(n + " is not a strong number");
}
}