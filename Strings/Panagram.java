import java.util.Scanner;
class Panagram{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.nextLine();
		boolean rs = isPanagram(st);
		if(rs)
			System.out.println("String is panagram");
		else
			System.out.println("String is not a panagram");
	}
	static boolean isPanagram(String str){
		int count[] = new int[26];
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if (ch >='A' && ch <='Z')
				count[ch-65]++;
			else if(ch>='a' && ch <= 'z')
				count[ch-97]++;
		}
		for (int i=0;i<26;i++){
			if(count[i] == 0)
				return false;
		}
		return true;
	}
}