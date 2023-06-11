package day36lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class LambdaForCourseObjects {
    public static void main(String[] args) {
        Courses courseTurkishDayTime = new Courses("Turkish Day Time", 124, "Summer", 97.2);
        Courses courseTurkishNightTime = new Courses("Turkish Night Time", 125, "Winter", 98.4);
        Courses courseEnglishDayTime = new Courses("English Day Time", 138, "Spring", 93.8);
        Courses courseEnglishNightTime = new Courses("English Night Time", 111, "Winter", 95.3);

        List<Courses> courses= new ArrayList<>();
        courses.add(courseTurkishDayTime);
        courses.add(courseTurkishNightTime);
        courses.add(courseEnglishDayTime);
        courses.add(courseEnglishNightTime);
        System.out.println("checkAvgScoreToBeGreaterThanSpecificValue(courses,95) = " + checkAvgScoreToBeGreaterThanSpecificValue(courses, 93));
        System.out.println("checkAnyCoursesNameContainsSpecificWord(courses,\"turkish\") = " + checkAnyCoursesNameContainsSpecificWord(courses, "turkish"));
        System.out.println("getCourseAvgHighest(courses) = " + getCourseAvgHighest(courses));
        System.out.println("getCourseAvgHighest(courses,2) = " + getCourseAvgHighest(courses, 2));

        System.out.println(getAvgNumOfStd(courses));
    }

    //example 1 : Check all average scores if they are greater than 95
    public static boolean checkAvgScoreToBeGreaterThanSpecificValue(List<Courses> courses, double avg){
      return   courses.stream().allMatch(t->t.getAvgScore()>avg);
    }
    //example 2: Create a method to check if at least one of the course names contains "Turkish" word with ignoring cases
    public static boolean checkAnyCoursesNameContainsSpecificWord(List<Courses> courses, String word){
        return courses.stream().map(t->t.getCourseName().toLowerCase()).anyMatch(t->t.contains(word.toLowerCase()));

    }
    //example 3: Create a method to find the courses whose average score is the highest
    public static Courses getCourseAvgHighest(List<Courses> courses){
        return courses.stream().sorted(Comparator.comparing(Courses:: getCourseName).reversed()).findFirst().get();
    }
    //example4: Create a method to find the courses whose average score is the third highest
    public static Courses getCourseAvgHighest(List<Courses> courses, int numOfSkippedLine) {
        return courses.
                stream().
                sorted(Comparator.comparing(Courses::getAvgScore).reversed()).skip(numOfSkippedLine).findFirst().get();
    }
    //example5: Create a method to find the course whose number of students is the second lowest
    public static Courses getCourseAvgGivenLowest(List<Courses> courses, long numOfSkippedLInes){
        return courses.stream().sorted(Comparator.comparing(Courses::getNumOfStudents)).skip(numOfSkippedLInes).findFirst().get();
    }
    //example 6: Create a method to find the average number of students in the courses
    public static double

    getAvgNumOfStd (List<Courses> courses){

        return courses.
                stream().
                map(t-> t.getNumOfStudents()).reduce(0,(t,u)-> (t+u)/courses.size());


    }
}
