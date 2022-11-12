package Date_API;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Date_API {
    public static void main(String[] args) {
    Scanner inputDate = new Scanner(System.in);
        System.out.println("Enter your date in dd.MM.yyyy format: ");

    Format dayFormat = new SimpleDateFormat("EEEE");
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    Date parsedDate = new Date();
        try {
        parsedDate = formatter.parse(inputDate.nextLine());
    } catch (
    ParseException e) {
        e.printStackTrace();
    }
        System.out.println("That date was a " + dayFormat.format(parsedDate));
        System.out.println();

    Date date = new Date();
        System.out.println(date);
    Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.DAY_OF_WEEK,7 );
        System.out.println(calendar1.getTime());
        System.out.println();

    // 2-й вариант
    int dayOfWeek = 7;                      // Вторник
    Calendar calendar2 = Calendar.getInstance();
    int weekday = calendar2.get(Calendar.DAY_OF_WEEK);
    int days = dayOfWeek - weekday;
        if (days < 0) days += 7;
        calendar2.add(Calendar.DAY_OF_YEAR, days);
    Date date1 =calendar2.getTime();
    String dateStr = new SimpleDateFormat("dd.MM.yyyy").format(date1);
        System.out.println("следующий вторник будет "+ dateStr);
    }
}

