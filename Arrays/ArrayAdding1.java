class ArrayAdding1{
public static void main(String args[]){
int ar[] = {20,30,60,50,90};
int s = sumOfArray(ar);
System.out.print("Sum of arry is : " + s);
}
static int sumOfArray(int x[]){
	int sum = 0;
	for(int i=0;i<x.length;i++){
		sum=sum+x[i];
	}
	return sum;
}
}