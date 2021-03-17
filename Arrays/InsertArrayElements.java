import java.util.Scanner;
class InsertArrayElements{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the how many values: ");
	int a = s.nextInt();
	int ar[] = new int[a];
	System.out.println("Enter " + a + " values: ");
	for(int i=0;i<a;i++){
		ar[i] = s.nextInt();
	}
	System.out.println("Enter the how many values: ");
	int b = s.nextInt();
	int br[] = new int[a];
	System.out.println("Enter " + b + " values: ");
	for(int i=0;i<b;i++){
		br[i] = s.nextInt();
	}
	System.out.println("Enter the index number: ");
	int c = s.nextInt();
	ar = insertArray (ar, br, c);
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]+" ");
	}
}
static int[] insertArray(int x[], int y[], int in){
	if(in<0||in>x.length){
		System.out.println("Index not in range");
		return x;
	}
	int z[] = new int [x.length+y.length];
	for(int i=0;i<y.length;i++){
		z[in+i]=y[i];
	}
	for (int i=0;i<x.length;i++){
		if(i<in)
			z[i]=x[i];
		else
			z[i+y.length]=x[i];
	}
	return z;
}
}