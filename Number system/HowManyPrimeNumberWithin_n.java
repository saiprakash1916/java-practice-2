import java.util.Scanner;
class HowManyPrimeNumberWithin_n{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int n = s.nextInt();
System.out.println("Number of prime number with in " + n + " is " + countPrime(n));
System.out.println("Sum of prime number with in " + n + " is " + sumOfPrime(n));
}
static boolean isPrime(int x){
int i = 2;
while (i <= x / 2){
if ( x % i == 0)
return false;
i ++;
}
return true;
}
static int countPrime(int n){
int count = 0;
for(int i = 1; i <= n; i++){
if(isPrime(i)){
count ++;
}
}
return count;
}
static int sumOfPrime( int n){
int sum = 0;
for(int i = 1; i <= n; i++){
if (isPrime(i)){
sum = sum + i;
}
}
return sum;
}
}