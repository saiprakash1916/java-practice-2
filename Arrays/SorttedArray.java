import java.util.Scanner;
class SorttedArray{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the how many values: ");
	int a = s.nextInt();
	int ar1[] = new int[a];
	System.out.println("Enter " + a + " values in sortted list: ");
	for(int i=0; i<a;i++){
		ar1[i]=s.nextInt();
	}
	System.out.println("Enter the how many values: ");
	int b = s.nextInt();
	int ar2[] = new int[b];
	System.out.println("Enter " + b + " values in sortted list: ");
	for(int i=0; i<b;i++){
		ar2[i]=s.nextInt();
	}
	int rs[] = merge(ar1,ar2);
	for(int i=0;i<rs.length;i++){
		System.out.print(rs[i]+" ");
	}	
}
static int[] merge(int a[], int b[]){
	int c[] = new int[a.length+b.length];
	int i=0,j=0,k=0;
	while(i<a.length&& i<b.length){
		if(a[i]<b[j]){
			c[k]=a[i];
			k++;
			i++;
		}
		else{
			c[k]=b[j];
			k++;
			j++;
		}
	}
	while(i<a.length){
		c[k]=a[i];
		k++;
		i++;
	}
	while(j<b.length){
		c[k]=b[j];
		k++;
		j++;
	}
	return c;
}
}