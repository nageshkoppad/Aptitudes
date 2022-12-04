package kgf;

public class Print {

	public static void main(String[] args) {
		
		   String name="mnbh";
		   char[] ch=name.toCharArray();
		   
		   char[][] arr=new char[13][13];
		   
		   arr[0][0]=(char) (ch[0]-32);
		   arr[0][1]='-';
		   arr[0][2]=(char) (ch[1]-32);
		   arr[0][3]=ch[1];
		   arr[0][4]='-';
		   arr[0][5]=(char) (ch[2]-32);
		   arr[0][6]=ch[2];
		   arr[0][7]=ch[2];
		   arr[0][8]='-';
		   arr[0][9]=(char) (ch[3]-32);
		   arr[0][10]=ch[3];
		   arr[0][11]=ch[3];
		   arr[0][12]=ch[3];
		   for(int i=0;i<arr.length;i++) {
			   for(int j=0;j<arr.length;j++) {
				   System.out.print(arr[i][j]);
			   }
			   System.out.println();
		   }
	}

}
