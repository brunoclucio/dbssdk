package br.com.dbsoft.tmp;



import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.junit.Test;

import br.com.dbsoft.util.DBSDate;



public class Tmp {

	@Test
	public void teste_date(){
		Long xTime = 0L;
		xTime = System.currentTimeMillis();
		System.out.println(DBSDate.toTimestamp(xTime));
//		System.out.println(DBSDate.toDateYMDHMS("2014-01-02 10:10:01").toLocaleString());
//		System.out.println(DBSDate.toDateYMDHMS("2014/01/02 10:10:01").toLocaleString());
//		System.out.println(DBSDate.toDateYMDHMS("20140102000201").toGMTString());
//		System.out.println(DBSDate.toDateYMDHMS("2014a102000201").toLocaleString());
//		assertEquals(DBSDate.toDateYMDHMS("2014-01-02 10:10:01").toLocaleString(), "02/01/2014 10:10:01");
//		assertEquals(DBSDate.toDateYMDHMS("2014/01/02 10:10:01").toLocaleString(), "02/01/2014 10:10:01");
//		assertEquals(DBSDate.toDateYMDHMS("20140102000201").toLocaleString(), "02/01/2014 00:02:01");
	}
	
//	@Test
	public void teste_getToCalendar() {
//		System.out.println(TimeZone.getDefault().getDisplayName());
//		System.out.println(TimeZone.getDefault().getID());
//		System.out.println(TimeUnit.MILLISECONDS.toSeconds(xTime));
//		System.out.println(TimeUnit.MILLISECONDS.toMinutes(xTime));
//		System.out.println(TimeUnit.MILLISECONDS.toHours(xTime));

		System.out.println("---");
		Long 		xTime = 1000L;
		DateTime	xDateTime;
		
		System.out.println("a1:" + DBSDate.toDate(xTime));
		System.out.println("a2:" + DBSDate.toTime(xTime));
		System.out.println("a3:" + DBSDate.toDateTime(xTime));
		System.out.println("a4:" + DBSDate.toDateTime(xTime));
		System.out.println("a5:" + DBSDate.toTimestamp(xTime));
		System.out.println("a6:" + DBSDate.toCalendar(xTime).getTimeInMillis());

		xDateTime = DBSDate.toDateTime(xTime);	
		System.out.println("t1:" + xDateTime.toLocalDate());
		xDateTime = DBSDate.toDateTime(xDateTime.getMillis());
		System.out.println("t2:" + xDateTime.toLocalDate());
		xDateTime = DBSDate.toDateTime(xDateTime.getMillis());
		System.out.println("t3:" + xDateTime.toLocalDate());
		xDateTime = DBSDate.toDateTime(xDateTime.getMillis());
		System.out.println("t4:" + xDateTime.toLocalDate());
		
//		xTime = xDTZ.convertLocalToUTC(xTime, true);
//		System.out.println("t21:" + DBSDate.toDate(xTime));
//		System.out.println("t22:" + DBSDate.toDateTime(xTime));
//		xDateTime = new DateTime(xTime, DateTimeZone.getDefault());
//		System.out.println(xTime + ":" + xDateTime.getZone());
//		show(xDateTime);
//
//		xDateTime = new DateTime(xTime, DateTimeZone.UTC);
//		System.out.println(xTime + ":" + xDateTime.getZone());
//		show(xDateTime);
		System.out.println("---");
	}
	

	/**
	 * Retornar data no tipo Calender a partir de data no tipo Timestamp
	 * @param pTime do tipo Date que se seja converte
	 * @return Data convertida para o tipo Calendar
	 */
	public static LocalDateTime show(DateTime pDateTime){
//		DateTime xDate = new DateTime(pTime, DateTimeZone.forOffsetMillis(0));
		System.out.println("a:" + pDateTime.toString());
		System.out.println("b:" + pDateTime.toDateTime());
		System.out.println("c:" + pDateTime.toDate());

		return null;
	}
}