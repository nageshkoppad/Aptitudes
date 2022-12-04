package kgf;

public class Swap {

	public static void main(String[] args) {
	 String dta="tommarrow is live there";
	 String[] mg=dta.split(" ");
	 String var=mg[0];
        mg[0]=mg[mg.length-1];
        mg[mg.length-1]=var;
        for(int i=0;i<mg.length;i++) {
        	System.out.print(mg[i]+" ");
        }
	}

}