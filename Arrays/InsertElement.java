import java.util.Scanner;
class InsertElement{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the how many values: ");
	int a = s.nextInt();
	int ar[] = new int[a];
	System.out.println("Enter " + a + " values: ");
	for(int i=0;i<a;i++){
		ar[i] = s.nextInt();
	}
	System.out.println("Enter the insert value: ");
	int b = s.nextInt();
	System.out.println("Enter the index number: ");
	int c = s.nextInt();
	ar = insert (ar, b, c);
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]+" ");
	}
}
static int[] insert(int x[], int ele, int ind){
	if(ind<0||ind>x.length){
		System.out.println("Index not in range");
		return x;
	}
	int y[] = new int [x.length+1];
	y[ind]=ele;
	for(int i=0;i<x.length;i++){
		if(i<ind)
			y[i]=x[i];
		else
			y[i+1]=x[i];
	}
	return y;
}
}