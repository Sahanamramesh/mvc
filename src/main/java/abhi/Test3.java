package abhi;

public class Test3 {

	public static void main(String[] args) {
	int n=10;
	String res="";
	while(n!=0){
		int d=n%2;
		res=d+res;
		n=n/2;
	}
	System.out.println(res);
	}
}
