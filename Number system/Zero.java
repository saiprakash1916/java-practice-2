import java.util.Scanner;
class Zero{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int n = s.nextInt();
if (n == 0)
System.out.println(n + " is zero");
else
System.out.println(n + " is not zero");
}
}