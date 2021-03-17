import java.util.Scanner;
class Vowels{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the name: ");
	String st = s.nextLine();
	int vc = 0;
	for(int i=0;i<st.length();i++){
		char ch = st.charAt(i);
		if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
			vc++;
	}
	System.out.println("Number of vowels present is " + vc);
}
}