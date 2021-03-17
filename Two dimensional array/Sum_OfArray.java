import java.util.Scanner;
public class Sum_OfArray{
	public static void main(String args[]){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter how many rows and columns: ");
		int r = s.nextInt();
		int c = s.nextInt();
		int mat [][]=new int[r][c];
		System.out.println("Enter " + r*c + " vlaues in row wises ");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j]=s.nextInt();
			}
		}
		int sum = 0;
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				sum=sum+mat[i][j];
			}
		}
		System.out.println("Sum of matrix is " + sum);
	}
}