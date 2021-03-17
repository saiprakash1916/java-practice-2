import java.util.Scanner;
class SmallestArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = sc.nextInt();
int ar[] = new int[n];
System.out.println("Enter " + n +" values: ");
for (int i = 0; i < n; i++){
ar[i] = sc.nextInt();
}
System.out.println("Smallest number is: " + getSmallest(ar));
}
static int getSmallest(int x[]){
int small = x[0];
for ( int i= 1; i < x.length; i++){
if (x[i]< small)
small = x[i];
}
return small;
}
}