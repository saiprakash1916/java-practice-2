import java.util.Scanner;
class First_n_FibonacciNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
int n = printFibNumber(a);
System.out.println("Fibonacci of " + n);
}
static int printFibNumber(int x){
int f1 = 0, f2 = 1;
while (x >= 1){
System.out.println(f1 + " is a fibonacci number ");
int f3 = f1 + f2;
f1 = f2;
f2 = f3;
x --;
}
return f1;
}
}