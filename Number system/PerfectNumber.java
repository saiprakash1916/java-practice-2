import java.util.Scanner;
class PerfectNumber{
static boolean isPerfectNumber(int n){
int sum = 0, i = 1;
while(i <= n / 2){
if(n % i == 0)
sum = sum + i;
i ++;
}
return sum == n;
}
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int x = s.nextInt();
boolean rs = isPerfectNumber(x);
if (rs == true)
System.out.println(x + " is a perfect number");
else
System.out.println(x + " is not a perfect number"); 
}
}