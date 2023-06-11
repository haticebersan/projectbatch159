package exercisesfromquestionbook;

public class StringManipulations {
    public static void main(String[] args) {
        //1)Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters
        //are in lower cases on the console
        String cityName=" mIAMI ";
        String newCityNAME=cityName.trim().toLowerCase();
       newCityNAME= newCityNAME.substring(0,1).toUpperCase()+ newCityNAME.substring(1);

        System.out.println(newCityNAME);

        //2)Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console
        String name1="Ali Can";
        String name2="Merve Star";
        String name3="Mark Tom";
        Integer c1=name1.replaceAll("\\s","").length();
        Integer c2=name2.replaceAll("\\s","").length();
        Integer c3=name3.replaceAll("\\s","").length();
        System.out.println("Total number of characters different from space: "+(c1+c2+c3));//Total number of characters different from space: 22



        //3)Create a String variable, print the total number of alphabetical and numeric characters in
        //the String on the console.
        //Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.
        String s = " Miami 33018!!! ";
       int newS= s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(newS);//10




        //4)Create a String variable, print the number of non-digit characters in the String on the
        //console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
        String s1 = "2a3B4?-!5";
        Integer numOfNonDigitChars = s1.replaceAll("[0-9]","").length();
        System.out.println("Total number of non-digit characters: " + numOfNonDigitChars);



        //5) Create a String variable and print just the last non-space character on the console for any
        //String.
        //Example: For ‘Ali Can’ you should print n
        // For ‘Miami ’ you should print i etc.
        String f = "  Ali Can  ";

       // String newF =  f.replaceAll("\\s", "").trim();
       // int indexOfLastChar  = newF.length()-1;
       // String LastNonSpaceChar = newF.substring(indexOfLastChar,indexOfLastChar+1);
      //  System.out.println(LastNonSpaceChar); //n


        //6) Create a String variable and find the sum of the ASCII values of the first and the last
        //characters of the String.
        String t = "Apex";
        char indexOfFirstChar = t.charAt(0);
        char indexOfLastChar = t.charAt(t.length()-1);
        int a = indexOfFirstChar;
        int b = indexOfLastChar;
        System.out.println(a+b);//185
        System.out.println((indexOfFirstChar)+(indexOfLastChar));//185


        // 7) Create a String variable and print all characters except the first character on the console.
        // Example:If the String is ‘Java’ you should print ‘ava’ on the console.
        String r = "Java";
        String allCharsExceptFirstChar=r.substring(1);
        System.out.println("All chars except first char:" + allCharsExceptFirstChar);//All chars except first char:ava



        //8) Create a String variable and print all characters except the last character on the console in
        //uppercase`s.
        //Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
        String k = "Java";
        String allCharsExceptLastChar=k.toUpperCase().substring(0,k.length()-1);
        System.out.println("All chars except the last char:"+allCharsExceptLastChar);



        //9) Create a String variable and print all characters except the first character and the last
        //character on the console in uppercase's.
        //Example:If the String is ‘Java’ you should print ‘AV’ on the console
        String z = "Java";
        String allCharsExceptFirstAndLastChar=k.toUpperCase().substring(1,z.length()-1);
        System.out.println("All chars except the last char:"+allCharsExceptFirstAndLastChar);//All chars except the last char:AV



        //10)Type code to check if a String has just a single space character any position in the middle
        //Example: For ‘Ali Can’ your code should print false on the console
        // For ‘ Ali Can ’ your code should print false on the console
        // For ‘ Ali Can ’ your code should print false on the console
        // For ‘Ali Can’ your code should print true on the console
        String x = "Tom Hanks";
        String trimmed=x.trim();
        String singleSpaceChar=trimmed.replaceAll("\\s","");
        Boolean isThereSingleSpaceInTheMiddle=trimmed.length()-singleSpaceChar.length()==1;
        System.out.println(isThereSingleSpaceInTheMiddle);//true


        //11)Type code to check if a String does not have any space character at the beginning and at
        //the end?
        //Example: For ‘ Ali ’ your code should print false on the console
        // For ‘Ali’ your code should print true on the console
        String name = "  Ali  ";
        String trimmed1 = name.trim();
        Boolean v = name.equals(trimmed1);
        System.out.println("Is there space at the beginning and/or at the end?" + !v); //true




        //12)Type code to check if a String has an uppercase initial and dot at the end.
        //Example: For ‘Ali’ your code should print false on the console
        // For ‘ali.’ your code should print false on the console
        // For ‘ Ali. ’ your code should print false on the console
        // For ‘Ali.’ your code should print true on the console
        // For ‘ALI.’ your code should print true on the console
     String p ="Ali.";
     char firstChar = p.charAt(0);
     char lastChar= p.charAt(p.length()-1);
     boolean isTheFirstCharUpper = firstChar>='A' && lastChar <='Z';
     boolean isTheLastCharDot = lastChar =='.';
     boolean isFirsCharAndLastChar= isTheFirstCharUpper && isTheLastCharDot;
     System.out.println("Is the last char upper and the last char dot?" + isFirsCharAndLastChar);//Is the last char upper and the last char dot?true

        //13)Type code to check if a password is valid or not for the following conditions;
        //Password must have at least 8 characters different from space character
        //Password must have at least 1 symbol
        //Example: For ‘A2b!’ your code should print false on the console
        // For ‘A2b3def’ your code should print false on the console
        // For ‘!1a23b4’ your code should print false on the console
        // For ‘!1a23b4?es’ your code should print true on the console
        // For ‘! a b 3 k’ your code should print false on the console
     String ps = "!1a23b4?es";
     boolean atLeastEightChar = ps.replaceAll("\\s","").length()>=8;
     boolean atLeastOneSymbol = ps.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>=0;
     System.out.println("Is the password valid?" + (atLeastEightChar&&atLeastOneSymbol));//Is the password valid?true


        //14)Type code to check if a String has a specific single character or not in three different ways.
     String m = "Hali";
     boolean specificChar = m.contains("a");
     System.out.println(specificChar);//true



       //15) String shirtPrice = ‘$12.99’;
        //String bookPrice = ‘$35.99’;
        //Type code to find the sum of the shirt and book prices
     String shirtPrice = "$12.99";
     String bookPrice = "$35.99";
     String sP = shirtPrice.replaceAll("[$.]","");
     String bP =bookPrice.replaceAll("[$.]","");
     double sPP = Double.valueOf(sP);
     double bPP = Double.valueOf(bP);
     System.out.println("Sum of prices are:" + (sPP+bPP)/100);//Sum of prices are:48.98


     //16) Type code to get initials of the first name and the last name of a given name. Middle name
        //is out of scope.
        //Example: Tom Hanks ==> TH, Mary Star ==> MS
     String nm = "Tom Hanks";
     String initialOfFirstName = nm.substring(0,1);
     String initialOfLastName  = nm.split( " ")[1].substring(0,1);
     System.out.println(initialOfFirstName+initialOfLastName);//TH



        //17)Type a code to find the number of punctuation marks used in a String
     String cd = "Wow! Ali is 13 years old, but he is a university student.";
     int totalNumChar = cd.length();
     int differentFromPunctuation = cd.replaceAll("\\p{Punct}","").length();
     int differenceFromEach = totalNumChar-differentFromPunctuation;
     System.out.println(differenceFromEach);//3


    }
}
