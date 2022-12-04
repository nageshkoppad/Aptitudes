package kgf;

import java.util.Iterator;
import java.util.Scanner;

public class Multi {
	public static void main(String[] arg) {
		Scanner scan=new Scanner(System.in);
          
			String n=scan.nextLine();
	String multi=n;
	Integer jk=new Integer(multi);
	System.out.println("Intege="+jk);
	int m=Integer.parseInt(multi);
	System.out.println("Integer22="+Integer.parseInt(multi));
	int count=0;
	int result=0;
	int f=0;
		for(int a=0;a<multi.length();a++) {
			count++;
		}
		System.out.println(count);
		for(int b=0;b<=count;b++) {
			for(int d=5;d<=5;d++) {
			if(b==2) {
				result=5*d;
			}
			if(b==1) {
				result=5;
			}
			}
		}
		int total=result*m;
		System.out.println(total);
	}
	
}
