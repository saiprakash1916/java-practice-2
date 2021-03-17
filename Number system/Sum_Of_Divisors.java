import java.util.Scanner;
class Sum_Of_Divisors{
static int sumDivisors(int n){
int sum = n, i = 1;
while(i <= n / 2){
if(n % i == 0)
sum = sum + i;
i ++;
}
return sum;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int x = sc.nextInt();
int s = sumDivisors(x);
System.out.println("Sum of divisors for " + x + " is " + s); 
}
}