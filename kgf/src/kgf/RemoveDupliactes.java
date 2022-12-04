package kgf;

public class RemoveDupliactes {

	public static void main(String[] args) {
		String name="all the best the";
		String[] arr= {};
		 for(int a=0;a<name.length();a++) {
			 for(int m=0;m<name.length();m++) {
			 if(name.charAt(a)!=' ') {
				 arr[a]=""+name.charAt(a);
			  }
			 }
			 for(int i=0;i<arr.length;a++) {
				 System.out.println(arr[i]);
			 }
		 }

	}

}
