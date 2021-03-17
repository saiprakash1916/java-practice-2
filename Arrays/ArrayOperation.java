import java.util.Scanner;
class ArrayOperation{
int[] readArray(){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter how many values: ");
	int n = s.nextInt();
	int ar[] = new int[n];
	System.out.println("Enter " + n + " values: ");
	for(int i=0;i<n;i++){
		ar[i]=s.nextInt();
	}
	return ar;
}
void dispArray(int ar[]){
	for (int i=0;i<ar.length;i++){
		System.out.print(ar[i]+" ");
	}
	System.out.println();
}
int[] merge(int x[], int y[]){
	int z[] = new int[x.length+y.length];
	for(int i=0;i<x.length;i++){
		z[i]=x[i];
	}
	for(int i=0;i<y.length;i++){
		z[x.length+i]=y[i];
	}
	return z;
}
}