import java.util.Scanner;
class Frequency_Of_EachChar{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String st = s.nextLine();
		int count[]=new int[128];
		for (int i=0;i<st.length();i++){
			char ch = st.charAt(i);
			count[ch]++;
		}
		for (int i=0;i<count.length;i++){
			if(count[i]>0)
				System.out.println((char)i + " present in " + count[i]);
		}
	}
}