import java.util.Scanner;
class LeepYear2{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter year: ");
int y = s.nextInt();
int ly = (y / 400 + y / 4 - y / 100);
System.out.println("Number of years" + ly);
}
}