//link to special two digit number program
import java.util.Scanner;
public class MainRunner{
public static void main(String args []){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int n = s.nextInt();
SpecialNumber sn = new SpecialNumber();
boolean rs = sn.isSpecialTwoDigit(n);
if (rs == true)
System.out.println(rs + " " + n + " is special two digit number");
else
System.out.println(rs + " " + n +  " is not a special two digit number");
}
}