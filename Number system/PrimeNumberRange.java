import java.util.Scanner;
class PrimeNumberRange{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number: ");
int m = s.nextInt();
System.out.println("Enter the second number: ");
int n = s.nextInt();
while ( m <= n){
boolean rs = isPrime(m);
if (rs)
System.out.println(m);
m ++;
}
}
static boolean isPrime(int x){
int i = 2;
while ( i <= x / 2){
if ( x % i == 0)
return false;
i ++;
}
return true;
}
}