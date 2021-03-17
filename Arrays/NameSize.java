import java.util.Scanner;
class NameSize{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many names: "); 
int n=sc.nextInt();
String name [] = new String [n];
System.out.println("Enter " + n + " names ");
for(int i=0;i<n;i++){
name[i]=sc.next();
}
String hname = highestLengthStr(name);
System.out.println("Highest name length is: " + hname);
}
static String highestLengthStr(String st[]){
String bname=st[0];
for(int i=1;i<st.length;i++){
if(bname.length()<st[i].length())
bname = st[i];
}
return bname;
}
}