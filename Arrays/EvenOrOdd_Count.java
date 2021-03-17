import java.util.Scanner;
class EvenOrOdd_Count{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = sc.nextInt();
int ar[] = new int[n];
System.out.println("Enter " + n +" values: ");
for (int i = 0; i < n; i++){
ar[i] = sc.nextInt();
}
System.out.println("Number of even number is: " + getEven(ar));
System.out.println("Number of odd number  is: " + getOdd(ar));
}
static int getEven(int x[]){
int even = 0;
for ( int i= 0; i < x.length; i++){
if (x[i] % 2 == 0)
even ++;
}
return even;
}
static int getOdd(int x[]){
int odd = 0;
for ( int i= 0; i < x.length; i++){
if (x[i] % 2 == 1)
odd ++;
}
return odd;
}
}
