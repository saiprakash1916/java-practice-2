import java.util.Scanner;
class Anagram{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String st1 = s.nextLine();
		System.out.println("Enter the second name: ");
		String st2 = s.nextLine();
		boolean rs = isAnagram(st1,st2);
		if(rs)
			System.out.println("String is anagram");
		else
			System.out.println("String is not a anagram");
}
static boolean isAnagram(String s1, String s2){
	int c1[] = freqAlph(s1);
	int c2[] = freqAlph(s2);
	for(int i=0;i<26;i++){
		if(c1[i] != c2[i])
			return false;
	}
	return true;
}
static int[] freqAlph(String s){
	int count [] = new int[26];
	for(int i=0;i<s.length();i++){
		char ch = s.charAt(i);
			if (ch >='A' && ch <='Z')
				count[ch-65]++;
			else if(ch>='a' && ch <= 'z')
				count[ch-97]++;
	}
	return count;
}
}