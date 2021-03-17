import java.util.Scanner;
class FibonacciNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
int f = fibNumber(a);
System.out.println(a + " fibonacci number is " + f);
}
static int fibNumber(int x){
int f1 = 0, f2 = 1;
while (x > 1){
int f3 = f1 + f2;
f1 = f2;
f2 = f3;
x --;
}
return f1;
}
}