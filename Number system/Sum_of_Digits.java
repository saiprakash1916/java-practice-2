import java.util.Scanner;
class Sum_of_Digits{
static int sumDigit(int n){
int sum = 0;
do{
int r = n % 10;
sum = sum + r;
n = n / 10;
}while ( n != 0);
return sum;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int x = sc.nextInt();
int s = sumDigit(x);
System.out.println("Sum of digits in " + x + " is " + s); 
}
}