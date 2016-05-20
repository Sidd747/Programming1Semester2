import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


public class SDDateTime {
  public static void main(String[] args) {
    System.out.println("Enter your birthday in form of month/day/year: ");
    Scanner scanner = new Scanner(System.in);
    //SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    //Date birth = convertToDate(birthday);
    int birthday = scanner.nextInt();
    Date birth = new Date(birthday);
    Calendar now = Calendar.getInstance();
    Calendar birthd = Calendar.getInstance();
    int hour1 = now.get(Calendar.HOUR_OF_DAY);
    int minute1 = now.get(Calendar.MINUTE);
    int day1 = now.get(Calendar.DAY_OF_MONTH);
    int year1 = now.get(Calendar.YEAR);
    int month1 = now.get(Calendar.MONTH);
    int second1 = now.get(Calendar.SECOND);
    birthd.setTime(birth);
    int hour2 = birthd.get(Calendar.HOUR_OF_DAY);
    int minute2 = birthd.get(Calendar.MINUTE);
    int day2 = birthd.get(Calendar.DAY_OF_MONTH);
    int year2 = birthd.get(Calendar.YEAR);
    int month2 = birthd.get(Calendar.MONTH);
    int second2 = birthd.get(Calendar.SECOND);
    System.out.println("Years: " + (year1-year2));
    System.out.println("Months: " + (month1-month2));
    System.out.println("Days: " + (day1-day2));
    System.out.println("Hours: " + (hour1-hour2));
    System.out.println("Minutes: " + (minute1-minute2));
    System.out.println("Seconds: " + (second1-second2));
  }
}