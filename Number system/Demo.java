import java.util.Scanner;
public class Demo{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n=s.nextInt();
		int re = sumEven(n);
		System.out.println(re);
	}
	static int sumEven(int x){
		int sum = 0;
		do{
			int r = x%10;
			sum = sum + Even(r);
			x=x/10;
		}while(x !=0);
		return sum;
	}
	static int Even(int x){
		if(x%2 ==0)
			return x;
		else
			return 0;
	}
}