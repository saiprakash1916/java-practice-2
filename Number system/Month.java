import java.util.Scanner;
class Month{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
int m= s.nextInt();
if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
System.out.println("31 days");
else if (m == 4 || m == 6 || m == 9 || m == 11)
System.out.println("30 days");
else if (m == 28 || m == 29)
System.out.println("28 or 29 days");
else
System.out.println("In valid input");
}
}