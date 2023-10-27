import java.util.Scanner;

public class StringAllFun {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter a row count: ");
		int row=sc.nextInt();
		
		System.out.println("ENter a col count: ");
		int col=sc.nextInt();
        
	    int[][] Arr=new int[row][col];
	    
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) {
	    		System.out.println("Enter element of index: "+(i+","+j));
	    		Arr[i][j]=sc.nextInt();
	    	}
	    }
	    
	   System.out.println("Before Transpose"); 
	   HelperFun.Fun(Arr);
	   
	   
	   System.out.println("After Transpose"); 
	   HelperFun.TransPose(Arr);
	   HelperFun.Fun(Arr);
		
		
	}
}
