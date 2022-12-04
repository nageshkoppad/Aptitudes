package kgf;

import java.util.Scanner;

public class Liking {

	
	public static String m1() {
		return "no one like this";
	}
	public static String m2(String name1) {
		return name1+" likes this";
	}
	public static String m3(String name1,String name2) {
		return name1+" "+name2+" like this";
	}
	public static String m4(String name1,String name2,String name3) {
		return name1+" "+name2+" "+name3+" like this";
	}
	public static String m5(String name1,String name2,String name3,String name4) {
		return name1+" "+name2+" "+name3+" "+name4+" like this";
	}
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		String name0=scan.nextLine();
		if(name0.length()==0) {
		System.out.println("["+""+"]"+"  -->"+m1());
		System.exit(0);
		}
		String name1=scan.nextLine();
		if(name1.length()==0) {
		System.out.println("["+name0+"]"+"  -->"+m2(name0));
		System.exit(0);
		}
		String name7=scan.nextLine();
		if(name7.length()==0) {
		System.out.println("["+name0+" "+name1+"]"+"  -->"+m3(name0,name1));
		System.exit(0);
		}
		String name3=scan.nextLine();
		if(name3.length()==0) {
		System.out.println("["+name0+" "+name1+" "+name7+"]"+"  -->"+m4(name0,name1,name7));
		System.exit(0);
		}
		if(name3.length()>0) {
		System.out.println("["+name0+" "+name1+" "+name7+" "+name3+"]"+"  -->"+m5(name0,name1,name7,name3));
		System.exit(0);
		}
	}
}
