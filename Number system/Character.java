import java.util.Scanner;
class Character{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first number: ");
char ch = s.next().charAt(0);
if (ch >= 'A' && ch <= 'Z')
System.out.println(ch + " is capital letter");
else if (ch >= 'a' && ch <= 'z')
System.out.println(ch + " is small letter");
else if (ch >= '0' && ch <= '9')
System.out.println(ch + " is digit");
else
System.out.println(ch + " special char");
}
}