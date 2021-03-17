//Read the person name, age, mobile number and city name.
import java.util.Scanner;
class PersonDetails{
public static void main (String args []){
Scanner s = new Scanner (System.in);
System.out.println("Enter your name: ");
String name = s.next();
System.out.println("Enter your age: ");
int age = s.nextInt();
System.out.println("Enter your mobile number: ");
long mobileNumber = s.nextLong();
System.out.println("Enter your city: ");
String city = s.next();
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Mobile Number: " + mobileNumber);
System.out.println("City: " + city);
}
}