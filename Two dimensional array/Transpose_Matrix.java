import java.util.Scanner;
public class Transpose_Matrix{
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
		System.out.println(y);
		int [][] transpose(int x[][]){
			int y[][]=new int[x[0].length][x.length];
			for(int i=0;i<x.length;i++){
				for (int j=0;j<x[i].length;j++){
					y[j][i]=x[i][j];
				}
			}
			return y;
		}
	}
}