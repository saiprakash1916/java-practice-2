import java.util.Scanner;
class Divisors{
static int countDivisors(int n){
int count = 1, i = 1;
while(i <= n / 2){
if(n % i == 0)
count ++;
i ++;
}
return count;
}
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int x = s.nextInt();
int rs = countDivisors(x);
System.out.println("Number of divisors for " + x + " is " + rs); 
}
}