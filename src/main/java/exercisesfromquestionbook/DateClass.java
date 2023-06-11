package exercisesfromquestionbook;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class DateClass {
    public static void main(String[] args) {

     //1) Type the code that finds out how many days Ali lived.
        //Date of birth of Ali is 12th of May 2002

        LocalDate birthDateOfAli = LocalDate.of(2002, 5, 12);
        LocalDate currentDate = LocalDate.now();
        long numberOfDaysAliLived = ChronoUnit.DAYS.between(birthDateOfAli, currentDate);
        System.out.println("The number of days Ali lived so far is " + numberOfDaysAliLived);


        //2)Type the code that finds out how many months Mehmet lived.
        //Date of birth of Ali is 4th of June 1997
        LocalDate birthDateOfMehmet = LocalDate.of(1997, 06, 04);
        LocalDate currentDateOfMehmet = LocalDate.now();
        long numberOfMonthsMehmetLived = ChronoUnit.MONTHS.between(birthDateOfMehmet, currentDateOfMehmet);
        System.out.println("The number of months Mehmet lived so far is " + numberOfMonthsMehmetLived);
        //A standard set of date periods units.
        //This set of units provide unit-based access to manipulate a date, time or date-time.
        // The standard set of units can be extended by implementing TemporalUnit.(ChronoUnit)

        //3)Date of birth of Ayse is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
        //and 12 days after Ayse's birthdate.

        LocalDate birthDateOfAyse = LocalDate.of(1997, 06, 04);
        LocalDate exactDate = birthDateOfAyse.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("Exact date is " + exactDate);
        //The plusYears() method of LocalDate class in Java is used to add the number of specified years in this
        // LocalDate and return a copy of LocalDate.

        //4)//Aliye was born 45 years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type code to calculate the exact date of birth of Aliye and Veli
        //Type code to check if the date of birth of Aliye and Veli is the same or not

        LocalDate dobAliye = LocalDate.of(1923, 10, 29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli = LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("Date of births are same " + dobAliye.equals(dobVeli));

        //5)Veliye was born 3 years and 11 days after Alis.
        //Alis gave you his date of birth as 24th of November 2012
        //Type code to calculate Veliye’s date of birth
        LocalDate dobAlis = LocalDate.parse("2012-11-24");
        LocalDate dobVeliye = dobAlis.plusYears(3).plusDays(11);
        System.out.println("The date of birth of Veli is " + dobVeliye);
        //Parsing means analyzing and converting a program into an internal format that a runtime environment can actually run.

        //6)Create a Date Value for your birthdate
        //and create Date Value for your kid's birthdate then
        //calculate the difference in days.
        LocalDate myDob = LocalDate.of(1999, 8, 3);
        LocalDate myKidsDob = LocalDate.of(2025, 3, 12);
        long difference = ChronoUnit.DAYS.between(myDob, myKidsDob);
        System.out.println(difference);

        //7)Get the last 2 digits of the year in current date
        LocalDate currentYear = LocalDate.of(2023, 5, 6);
        int lastTwoDigits =currentYear.getYear()%100;
        System.out.println("Last 2 digits of the year is " + lastTwoDigits);

        //8)Type code to check if a given year is “Leap year” or not
        //Leap Year:
        //i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900
        //is not
        //ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007 is not
        LocalDate leapYear = LocalDate.of(2023, 5, 6);
        boolean isLeap = leapYear.isLeapYear();
        System.out.println("The year is leap year " + isLeap);

        //9) Find the sum of the month numbers of two different dates
        LocalDate certainDate  = LocalDate.of(1996, 8, 21);
        LocalDate otherDate = LocalDate.of(2015, 3, 12);
        System.out.println("The sum is " + certainDate.getMonth() + otherDate.getMonth());

        //10) Find the difference in hours for two different dates
        LocalDateTime myHours = LocalDateTime.of(1996, 8, 21, 5,12);
        LocalDateTime myKidsHours = LocalDateTime.of(2015, 3, 12,13 ,23);
        long differenceInHours = ChronoUnit.HOURS.between(myHours, myKidsHours);
        System.out.println("The difference in hours is " + differenceInHours);
























    }
}
