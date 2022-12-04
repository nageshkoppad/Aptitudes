package kgf;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="nagesh";
		char[] arr=name.toCharArray();
		for(int i=0;i<arr.length;i++) {
			arr[i]=(char) (arr[i]-32);
		}
		for (char c : arr) {
			System.out.println(arr);
		}
		char ch='q';
		ch=(char) (ch-32);
		System.out.println(ch);
	
	}

}
