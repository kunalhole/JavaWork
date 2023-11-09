import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class DateTimeConversion {

	public static void main(String[] args) {
		
		Date dt=new Date();
		//server date
		System.out.println(dt);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(java.time.Clock.systemUTC().instant()); 
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

		//date to string
		System.out.println(sdf.format(dt));
		
//		System.out.println("Enter a Date");
//		String date=sc.next();
		

	}

}
