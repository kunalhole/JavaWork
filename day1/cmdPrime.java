package day1;

public class cmdPrime {
	
	public static boolean isPrime(int num) {
		boolean flag=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
 
	public static void fun(String[] args) {
		
		for(int i=0;i<args.length;i++) {
			int num=Integer.parseInt(args[i]);
			if(isPrime(num)) {
				System.out.println(num+ " is Prime");
				for(int j=1;j<=10;j++) {
					
					System.out.print(num*j+" ");
					
				}
			}else {
				System.out.println("");
				System.out.println(num+" is not Prime");
				System.out.println(num/10);
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		if(args.length==0) {
			System.out.println("Enter something to the cmd");
			return ;
		}
		
		
		fun(args);

	}

}
