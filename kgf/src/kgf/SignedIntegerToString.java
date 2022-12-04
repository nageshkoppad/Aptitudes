package kgf;

import java.util.Scanner;

public class SignedIntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		Integer in=new Integer(a);
		String nk=in.toString();
		System.out.println(nk);
		
		System.out.println(nk.length());
	}
}
