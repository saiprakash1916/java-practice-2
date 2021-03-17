import java.util.Scanner;
class String_ConvertTo_UpperCase{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.nextLine();
		st = toCapital(st);
		System.out.println(st);
}
static String toCapital(String str){
	char ch[] = str.toCharArray();
	for(int i=0;i<ch.length;i++){
		if(ch[i]>='a' && ch[i]<='z')
			ch[i]=(char)(ch[i]-32);
	}
	return new String(ch);
}
}