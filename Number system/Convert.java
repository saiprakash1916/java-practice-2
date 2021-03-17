class P1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal Number");
		int n=sc.nextInt();
		boolean rs=Special(n);
		if(rs==true)
		System.out.println(n+" decimal to binary is"+rs);
		else
		System.out.println(" decimal to binary is");