package abhi;

public class Test1 {

	public static void main(String[] args) {
		int first[]={1,4,9,6,4};
		int second[]={2,4,2,9};
		int store[]=new int[second.length];
		int s=0;
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < first.length; j++) {
				if(second[i]==first[j]){
					store[s]=second[i];
					s++;
				}
				}
			}
		for (int i = 0; i < store.length; i++) {
			
			System.out.println(store[i]);
		}
	}}
