import java.util.Scanner;
class DayName{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the date (DD MM YYYY)");
		System.out.println("Enter the date");
		int d = s.nextInt();
		System.out.println("Enter the month");
		int m = s.nextInt();
		System.out.println("Enter the year");
		int y = s.nextInt();
		Date dt = new Date(d,m,y);
		System.out.println("Day name is " + dt.getDayName());
	}
}