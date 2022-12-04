package kgf;

import java.util.Scanner;

public class Operation {
    public static String opertion(String arg,int a,int b) {
    	if(arg.contains("+")) {
    		int add=a+b;
    	return "addition="+add;
    	}
    	if(arg.equals("-")) {
    		int sub=a-b;
    		return "substraction="+sub;
    	}
    	if(arg.equals("*")) {
    		int sub=a*b;
    		return "multiplication="+sub;
    	}
    	if(arg.equals("/")) {
    		int sub=a/b;
    		return "Division=";
    	}
    	
    	return "";
    }
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
		Scanner scan=new Scanner(System.in);
		Scanner str=new Scanner(System.in);
		int a=scan.nextInt();
		String st=str.nextLine();
		int b=scan.nextInt();
		String d=Operation.opertion(st,a,b);
		System.out.println(d);
		}
	}
}
