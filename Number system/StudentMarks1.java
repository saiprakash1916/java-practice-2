import java.util.Scanner;
class StudentMarks1{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter first subject marks: ");
int m1 = s.nextInt();
System.out.println("Enter second subject marks: ");
int m2 = s.nextInt();
System.out.println("Enter third subject marks: ");
int m3 = s.nextInt();
System.out.println("Enter fourth subject marks: ");
int m4 = s.nextInt();
if (m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35)
System.out.println("Fail");
else
System.out.println("Pass");
}
}