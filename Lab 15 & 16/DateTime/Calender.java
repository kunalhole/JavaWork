import java.util.Calendar;
import java.util.Date;

public class Calender {

	public static void main(String[] args) {
		
		Calendar c= Calendar.getInstance();
		
		System.out.println(c.getTime());
		System.out.println(c.get(c.YEAR));
		System.out.println(c.get(c.DAY_OF_MONTH));
		System.out.println(c.get(c.WEEK_OF_MONTH));
		Date d=new Date();
		System.out.println(d);

	}

}
