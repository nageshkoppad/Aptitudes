package kgf;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String var=scan.nextLine();
		String name=var;
		int count=0;
		int max=0;
		char[] ch2=name.toCharArray();
		for(int i=0;i<ch2.length;i++){
			if(ch2[i]=='a') {
				count++;
			}
			if(ch2[i]=='e') {
				count++;
			}
			if(ch2[i]=='i') {
				count++;
			}
			if(ch2[i]=='o') {
				count++;
			}
			if(ch2[i]=='u') {
				count++;
			}
			for(char m='a';m<='z';m++) {
				if(ch2[i]==m && ch2[i]!='a' && ch2[i]!='e'&& ch2[i]!='i'&& ch2[i]!='o'&& ch2[i]!='u') {
					max++;
				}
			}
			
		}
		System.out.println("vowels="+count);
		System.out.println("consonents="+max);
	}

}
