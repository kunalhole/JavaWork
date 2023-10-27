import java.lang.Math;
public class HelperFun {

	public static void HelperFun(String str1,String str2) {
		
        int sum=0;
        
        for(int i=0;i<str2.length();i++) {
        	char ch=str1.charAt(i);
        	char ch1=str2.charAt(i);
        	sum=Math.abs((int)ch-(int)ch1);
        	System.out.println(sum);
        }
        
       
		
	}
	
	public static void Fun(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println("");
		}
}
	
	public static void RowWiseSum(int[][] arr) {
		
		
		
		for(int i=0;i<arr.length;i++) {
			int rowSum=0;
			for(int j=0;j<arr[i].length;j++) {
				rowSum+=arr[i][j];
			}
			
			System.out.println("Row"+ i +" Sum is: "+rowSum);
		}
		
		
		
	}
	
public static void ColWiseSum(int[][] arr) {
		
		
		
		for(int i=0;i<arr[0].length;i++) {
			int colSum=0;
			for(int j=0;j<arr.length;j++) {
				colSum+=arr[j][i];
			}
			
			System.out.println("Column "+ i +" Sum is: "+colSum);
			
		}
		
		
		
	}


public static void TransPose(int[][] arr) {
	
      for(int i=0;i<arr.length;i++) {
    	  for(int j=i+1;j<arr[0].length;j++) {
    		  
    		  if(i!=j) {
    			  
    			  int temp=arr[i][j];
    			  arr[i][j]=arr[j][i];
    			  arr[j][i]=temp;
    			  
    		  }
    		  
    	  }
      }
	
}

public static int minNumber(int[][] arr) {
	int mini=arr[0][0];
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(mini>arr[i][j]) {
				mini=arr[i][j];
			}
		}
	}
	
	
	return mini;
}

public static int maxNumber(int[][] arr) {
	int max=arr[0][0];
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if(max<arr[i][j]) {
				max=arr[i][j];
			}
		}
	}
	
	
	return max;
}


public static void countofNumber(int[][]arr) {
	
	
for(int i=0;i<arr.length;i++) {

	for(int j=0;j<arr[0].length;j++) {
		
		countOfNumber(arr,arr[i][j]);
		
	}
	
}
	
	
}

public static void countOfNumber(int[][]arr ,int key) {
	int count=0;
	for(int i=0;i<arr.length;i++) {

		for(int j=0;j<arr[0].length;j++) {
			if(arr[i][j]==key) {
				count++;
			}
		}
		
	}
	
	System.out.println(key+" element has a count of: "+count);
	
}
	
	
}
