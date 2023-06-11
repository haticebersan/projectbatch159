package exercisesfromquestionbook;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeClass {
    public static void main(String[] args) {
        //1) If the hour is
        //i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
        //ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
        //iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
        //iv) For the others print ‘Personal time’ on the console
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        if(hour>0 && hour<5){
            System.out.println("Sleeping time");
        }else if(hour>8 && hour<16){
            System.out.println("Working time");
        }else if(hour>19 && hour<22){
            System.out.println("Family time");
        }else{
            System.out.println("Personal time");}

        //2)Type code to find time difference between Japan time zone and Germany time zone
        LocalDateTime timeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInJapan);
        LocalDateTime timeInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInGermany);
        long difference = ChronoUnit.HOURS.between(timeInGermany, timeInJapan);
        System.out.println(difference);

        //3)Ali was born in Istanbul on 5th of February 2015 at 10:00 am TRT, Mark was born in the USA
        //on 5th of February 2015 at 12:00 pm EST. What is the difference between Ali’s birth time
        //and Mark’s birth time in hours?
        LocalDateTime dobAli = LocalDateTime.of(2015, 2, 5, 10, 0, 0);
        ZonedDateTime localDobAli = dobAli.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime dobMark = LocalDateTime.of(2015, 2, 5, 12, 0, 0);
        ZonedDateTime localDobMark = dobMark.atZone(ZoneId.of("America/New_York"));
        long differenceInHoursBetween = ChronoUnit.HOURS.between(localDobAli, localDobMark);
        System.out.println("The difference in hours is " + differenceInHoursBetween);
        //The java.time.LocalDateTime.atZone(ZoneId zone) method combines
        // this date-time with a time-zone to create a ZonedDateTime.
        //Declaration
        //Following: is the declaration for java.time.LocalDateTime.atZone(ZoneId zone) method

        //4)Aliye was born on 5th of February 2015 at 10:15 am EST, Marc was born on 6th of March 2015
        //at 12:25 pm EST. Aliye remained in intensive care for 23 hours and 35 minutes. Marc remained
        //in intensive care for 1 hour and 12 minutes. What is the difference in minutes between the
        //times of Aliye and Marc leaving the intensive care unit?
        LocalDateTime dobAliye = LocalDateTime.of(2015, 2, 5, 10, 15, 0);
        LocalDateTime dobMarc = LocalDateTime.of(2015, 3, 6, 12, 25, 0);
        long differenceBetweenInHours = ChronoUnit.MINUTES.between(dobAliye, dobMarc);
        System.out.println("The difference in hours is " + differenceBetweenInHours);

        //5) Tom was born on 2/23/2018 at 3:25 PM in GMT. What is the exact birthdate and time of
        //Tom in Japan?
        LocalDateTime timeInTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime timeInGmt = LocalDateTime.now(ZoneId.of("GMT"));
        long diffInHours = ChronoUnit.HOURS.between(timeInGmt, timeInTokyo);
        LocalDateTime dobTom = LocalDateTime.of(2018, 2, 23, 15, 25, 0).minusHours(diffInHours);
        System.out.println("Date of birth in Tokyo is " + dobTom);
        //Description
        //The java.time.LocalTime.minusHours(long hoursToSubtract)
        // method returns a copy of this LocalTime with the specified hours subtracted.















    }
}
