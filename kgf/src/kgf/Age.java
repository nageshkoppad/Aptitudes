package kgf;

import java.util.Scanner;

public class Age {
	
   public static int age(int father,int son) {
	   return father-son*2;
   }
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<=100;i++) {
		System.out.println("father age=");
		int c=scan.nextInt();
		System.out.println("son age=");
		int b=scan.nextInt();
		
         int a= age(c,b);
         if(a>=0) {
         System.out.println(a+" years back");
         System.out.println("***********************************************************");
         }else {
        	 a=(-1)*a;
        	 System.err.println(a+" years after");
        	 System.out.println("*******************************************************");
         }
		}
	}

}
