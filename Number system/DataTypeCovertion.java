import java.util.Scanner;
class DataTypeCovertion {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the number in Decimal format: ");
int a = s.nextInt();
Convert cv = new Convert();
System.out.println("Binary of" + a + " is " + cv.decToBin(a));
System.out.println("Binary of" + a + " is " + cv.decToOct(a));
System.out.println("Binary of" + a + " is " + cv.decToHex(a));
}
}
