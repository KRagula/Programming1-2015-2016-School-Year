//Kanishka Ragula
//Age Project (Date Time)
//January-February 2016
import java.text.*;
import java.util.*;
public class KRDateTime {
  public static void main(String[] args) {
    int months[] = {1,2,3,4,5,6,7,8,9,10,11,12};    
    System.out.println("What is your birthday? (MM/dd/yyyy)");
    Scanner scanner = new Scanner(System.in);
    String birthDay = scanner.nextLine();
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    String [] parts = birthDay.split("/");
    Calendar time = Calendar.getInstance();
    int ageMillenniums = 0;
    int ageCenturies = 0;
    int ageDecades = 0;
    String stringMillenniums = "";
    String stringCenturies = "";
    String stringDecades = "";
    String stringYears = "";
    String stringMonths = "";
    String stringDays = "";
    String stringHours = "";
    String stringMinutes = "";
    String stringSeconds = "";
    int day = (time.get(Calendar.DATE));
    int month = (months[time.get(Calendar.MONTH)]);
    int year = (time.get(Calendar.YEAR));
    int hour = (time.get(Calendar.HOUR));
    int minute = (time.get(Calendar.MINUTE));
    int second = (time.get(Calendar .SECOND));
    int ageDays = day - Integer.parseInt(parts[1]);
    int ageMonths =  month - Integer.parseInt(parts[0]);
    int ageYears =  year - Integer.parseInt(parts[2]);
    if(ageDays <0) {
      if(month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11 || month == 1){
        ageMonths --;
        ageDays += 31;
      } else if(month == 5 || month == 7 || month == 10 || month == 12) {
        ageMonths --;
        ageDays += 30;
      } else {
        ageMonths --;
        ageDays += 28;
      } 
    }    
    if(ageMonths < 0) {
      ageYears --;
      ageMonths += 12;
    }
    while(ageYears > 1000) {
      ageYears -= 1000;
      ageMillenniums ++;
    }
    while(ageYears > 100) {
      ageYears -= 100;
      ageCenturies ++;
    }
    while(ageYears > 10) {
      ageYears -= 10;
      ageDecades ++;
    }
    if(ageMillenniums == 0) {
      stringMillenniums = "";
    } else if(ageMillenniums == 1) {
      stringMillenniums = ageMillenniums + " millennium, ";
    } else {
      stringMillenniums = ageMillenniums + " millenniums, ";
    }
    if(ageCenturies == 0) {
      stringCenturies = "";
    } else if(ageCenturies == 1) {
      stringCenturies = ageCenturies + " century, ";
    } else {
      stringCenturies = ageCenturies + " centuries, ";
    }    
    if(ageDecades == 0) {
      stringDecades = "";
    } else if(ageDecades == 1) {
      stringDecades = ageDecades + " decade, ";
    } else {
      stringDecades = ageDecades + " decades, ";
    }
    if(ageYears == 0) {
      stringYears = "";
    } else if(ageYears == 1) {
      stringYears = ageYears + " year, ";
    } else {
      stringYears = ageYears + " years, ";
    }
    if(ageMonths == 0) {
      stringMonths = "";
    } else if(ageMonths == 1) {
      stringMonths = ageMonths + " month, ";
    } else {
      stringMonths = ageMonths + " months, ";
    }
    if(ageDays == 0) {
      stringDays = "";
    } else if(ageDays == 1) {
      stringDays = ageDays + " day, ";
    } else {
      stringDays = ageDays + " days, ";
    }
    if(hour == 0) {
      stringHours = "";
    } else if(hour == 1) {
      stringHours = hour + " hour, ";
    } else {
      stringHours = hour + " hours, ";
    }
    if(minute == 0) {
      stringMinutes = "";
    } else if(minute == 1) {
      stringMinutes = minute + " minute, ";
    } else {
      stringMinutes = minute + " minutes, ";
    }
    if(second == 0) {
      stringSeconds = "";
    } else if(second == 1) {
      stringSeconds = second + " second ";
    } else {
      stringSeconds = second + " seconds ";
    }
    System.out.println(name + " is " + stringMillenniums + stringCenturies + stringDecades + stringYears + stringMonths + stringDays + stringHours + stringMinutes + stringSeconds + "old");
  }
}