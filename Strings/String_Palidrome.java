import java.util.Scanner;
class String_Palidrome{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.next();
		boolean rs = isPalidrome(st);
		if(rs)
			System.out.println("String is palidrome");
		else
			System.out.println("String is not a palidrome");
}
static boolean isPalidrome(String s){
	s=s.toLowerCase();
	char ch[]=s.toCharArray();
	for (int i=0;i<ch.length/2;i++){
		if (ch[i] != ch[ch.length-1-i])
			return false;
	}
	return true;
}
}