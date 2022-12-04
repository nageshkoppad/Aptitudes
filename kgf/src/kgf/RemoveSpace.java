package kgf;

import java.util.HashSet;
import java.util.Set;

public class RemoveSpace {

	public static void main(String[] args) {
		String var="iam fine ok";
		String[] arr=var.split(" ");
    Set<String> arr2=new HashSet<>();
      
     for(int i=0;i<arr.length;i++) {
    	 arr2.add(arr[i]);
     }
     for (String string : arr2) {
		System.out.print(string);
	}
	}

}
