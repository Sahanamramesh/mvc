package abhi;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Noel-sees Leon";
String rev="";
for (int i=str.length()-1;i>=0; i--) {
	if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
	rev=rev+str.charAt(i);
}
System.out.println(rev);

	
}
	}

