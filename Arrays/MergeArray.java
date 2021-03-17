class MergeArray{
public static void main(String args[]){
	ArrayOperation ao = new ArrayOperation();
	System.out.println("Read first array: ");
	int a[]=ao.readArray();
	System.out.println("Read second array: ");
	int b[]=ao.readArray();
	int c[]=ao.merge(a,b);
	System.out.print("First array elements: ");
	ao.dispArray(a);
	System.out.print("Second array elements: ");
	ao.dispArray(b);
	System.out.print("Merge array elements: ");
	ao.dispArray(c);
}
}