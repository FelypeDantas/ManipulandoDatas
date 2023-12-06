package MetodosDate;

import java.sql.Date;
import java.util.Calendar;

public class Datas {
   public static void main(String args[]) {
	   
	   // 01 de jan 1970
	  System.out.println(System.currentTimeMillis());
	  
	 Date agora = new Date(System.currentTimeMillis());
	 System.out.println(agora);
	 
	 agora.getTime();
	 agora.setTime(System.currentTimeMillis());
	 System.out.println(agora.compareTo(agora));
	 
	 Calendar c = Calendar.getInstance();
	 c.set(1980, Calendar.FEBRUARY, 12);
	 System.out.println(c.getTime());
   }
}
