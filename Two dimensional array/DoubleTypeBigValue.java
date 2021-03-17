import java.util.Scanner;
class DoubleTypeBigValue{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the how many row and columns: ");
		int r=s.nextInt();
		int c=s.nextInt();
		double mat[][]=new double[r][c];
		System.out.println("Enter " + r * c + " values in row wise: ");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j]=s.nextDouble();
			}
		}
		System.out.println("user enterd matrix");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		double big=mat[0][0];
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				if(big<mat[i][j])
					big=mat[i][j];
			}
		}
		System.out.println("big value is: " + big);
	}
}