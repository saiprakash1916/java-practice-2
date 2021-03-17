import java.util.Scanner;
class HowMany_Words_Present_String{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.nextLine();
		int c = countWords(st);
		System.out.println("Number of words in the sentence is " + c);
}
static int countWords(String str){
	int wc=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++){
		if(i==0 && ch[0] != ' ' || ch[i] !=' ' && ch[i-1] == ' ')
			wc++;
	}
	return wc;
}
}