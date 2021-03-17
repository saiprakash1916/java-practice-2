import java.util.Scanner;
class LeepYear1{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter year: ");
int y = s.nextInt();
if (y % 400 == 0 || (y % 4 ==0 && y % 100 != 0))
System.out.println(y + " is leep year");
else
System.out.println(y + " is not a leep year");
}
}