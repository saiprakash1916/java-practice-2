import java.util.Scanner;
class Frequency_Of_All{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the name: ");
	String st = s.nextLine();
	int uc=0,lc=0,dc=0,spc=0;
	for(int i=0;i<st.length();i++){
		char ch = st.charAt(i);
		if(ch>='A'&&ch<='Z')
			uc++;
		else if(ch>='a'&&ch<='z')
			lc++;
		else if(ch>='0'&&ch<='9')
			dc++;
		else
			spc++;
	}
	System.out.println("Number of capital letters " + uc);
	System.out.println("Number of small letters " + lc);
	System.out.println("Number of numbers " + dc);
	System.out.println("Number of special char " + spc);
}
}