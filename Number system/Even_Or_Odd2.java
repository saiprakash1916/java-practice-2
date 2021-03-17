//by using switch condition
import java.util.Scanner;
class Even_Or_Odd2{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter number: ");
int n = s.nextInt();
switch(n % 2){
case 0: System.out.println(n + " is even number");
break;
case 1: System.out.println(n + " is not even number");
}
}
}