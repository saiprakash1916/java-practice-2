import java.util.Scanner;
class PrimeNumber{
static boolean isPrimeNumber(int n){
int i = 2;
while(i <= n / 2){
if(n % i == 0)
return false;
i ++;
}
return true;
}
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int x = s.nextInt();
boolean rs = isPrimeNumber(x);
if (rs == true)
System.out.println(x + " is a prime number");
else
System.out.println(x + " is not a prime number"); 
}
}