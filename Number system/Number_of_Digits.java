import java.util.Scanner;
class Number_of_Digits{
static int countDigit(int n){
int count = 0;
do{
n = n / 10;
count ++;
}while ( n != 0);
return count;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int x = sc.nextInt();
int s = countDigit(x);
System.out.println("Number of digits in " + x + " is " + s); 
}
}