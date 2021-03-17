import java.util.Scanner;
class DiseriumNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
Diserium d = new Diserium();
boolean re = d.isDiseriumNumber(a);
if (re == true)
System.out.println(a + " is a diserium number");
else
System.out.println(a + " is not a diserium number");
}
}