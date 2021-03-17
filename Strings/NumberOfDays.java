import java.util.Scanner;
class NumberOfDays{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first date (DD MM YYYY)");
		System.out.println("Enter the date");
		int d = s.nextInt();
		System.out.println("Enter the month");
		int m = s.nextInt();
		System.out.println("Enter the year");
		int y = s.nextInt();
		Date dt1 = new Date(d,m,y);
		System.out.println("Enter the second date (DD MM YYYY)");
		System.out.println("Enter the date");
		d = s.nextInt();
		System.out.println("Enter the month");
		m = s.nextInt();
		System.out.println("Enter the year");
		y = s.nextInt();
		Date dt2 = new Date(d,m,y);
		System.out.println("number of days between these two dates: ");
		System.out.println(dt2.noOfDays() - dt1.noOfDays());
	}
}