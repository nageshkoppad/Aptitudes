package kgf;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		for(int m=0;m<100;m++) {
		String str=scan.nextLine();
		String ch=scan.nextLine();
		char[] ch1=ch.toCharArray();
		String name=str;
		int count=0;
		for(int i=0;i<name.length();i++) {
			for(int l=0;l<ch1.length;l++) {
			if(name.charAt(i)==ch1[0]) {
				count++;
			}
			
		}
		}
		System.out.println(count);

	}
	}
}
