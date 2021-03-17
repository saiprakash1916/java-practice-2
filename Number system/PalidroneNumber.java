import java.util.Scanner;
class PalidroneNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
Palidrone p = new Palidrone();
boolean re = p.isPalidronenumber(a);
if (re == true)
System.out.println(a + " is a palidrone number");
else
System.out.println(a + " is not a palidrone number");
}
}