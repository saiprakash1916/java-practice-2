import java.util.Scanner;
class HappyNumber{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int a = s.nextInt();
boolean n = Happy(a);
if (n == true)
System.out.println(a + " is a happy number");
else
System.out.println(a + " is not a happy number");
}
static boolean Happy(int x){
while (x > 9){
int sum = 0;
do{
int r = x % 10;
sum = sum + r * r;
x = x / 10;
}while(x != 0);
x = sum;
}
return x == 1 || x == 7;
}
}