package kgf;

public class PatternXworkz {

	public static void main(String[] args) {
		
		char[][] n= {{'1','2','3','4',' ',' ',' ',' ',' ',' ',' '},{'1','2','3','4',' ',' ',' ',' ',' ',' ',' '},{'1','2','X','-','w','o','r','k','z',' ','4'},{'1','2','3','4',' ',' ',' ',' ',' ',' ',' '}};
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<11;j++) {
				System.out.print(n[i][j]);
			}
			System.out.println();
		  }
	}
}
