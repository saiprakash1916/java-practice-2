import java.util.Scanner;
class PrimeNumberFirst_n{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
int n = s.nextInt();
for (int i = 1; n > 0; i++){
boolean rs = isPrime(i);
if(rs){
System.out.println(i);
n --;
}
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