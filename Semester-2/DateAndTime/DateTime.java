//import java.util.Scanner;
//import java.util.Calendar;
import java.text.*;
import java.util.*;

public class DateTime {
  public static void main(String[] args) {
//    Calendar time = Calendar.getInstance();
//    //int minute = (time.get(Calendar.MINUTE));
//    //int hour = (time.get(Calendar.HOUR));
//    int day = (time.get(Calendar.DATE));
//    String month = (months[time.get(Calendar.MONTH)]);
//    int year = (time.get(Calendar.YEAR));
//    System.out.println(year + "/" + month + "/" + day);
    Date now = new Date();
    SimpleDateFormat td = new SimpleDateFormat("yyyy/MM/dd");
    String nowString = td.format(now);
    System.out.println(nowString);
  }
}