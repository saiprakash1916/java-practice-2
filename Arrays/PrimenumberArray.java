import java.util.Scanner;
class PrimenumberArray{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter how many numbers: ");
	int n = s.nextInt();
	int ar[] = new int[n];
	System.out.println("Enter " + n + " elements: ");
	for(int i=0;i<n;i++){
		ar[i]=s.nextInt();
	}
	System.out.println("Number of prime numbers: " + countPrime(ar));
}
static int countPrime(int a[]){
	int count=0;
	for(int i=0;i<a.length;i++){
		boolean rs = isPrime(a[i]);
		if(rs)
			count++;
	}
	return count;
}
static boolean isPrime(int x){
	int j=2;
	while(j<= x/2){
		if (x%j ==0)
		return false;
		j++;
	}
	return true;
}
}