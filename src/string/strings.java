package string;

import java.util.Arrays;

/**
 * @author rimon mostafiz (ferary.rimon@gmail.com)
 */
public class strings {
    void go() {
        //creat a new string object
        String string = new String("Hello World");

        //Pointing same object reference
        String string1 = "This is a string";
        String string2 = "This is a string";

        //Not same
        String string3 = new String("Hello");
        String string4 = new String("Hello");

        String tab = "\t this is a tab";
        String rrr = "Translated into a single carriage return character in the string\r";
        String nl = "new line\n";

        System.out.println(tab);
        System.out.println(nl);
        System.out.println(rrr);

        //concat string
        String one = "Hello";
        String two = "World";
        String concatOneAndTwo = one + " " + two;
        System.out.println(concatOneAndTwo);

        //string concatenation performance
        String actual = new StringBuilder(one).append(two).toString(); //StringBuilder Class + append method

        String[] strings = new String[]{"one", "two", "three", "four", "five"};
        String result = null;

        for (String st : strings) {
            result = result + st;
        }

        //fastest way to concat is to create StringBuilder once
        StringBuilder sb = new StringBuilder();
        for (String st : strings) {
            sb.append(st);
        }
        String res = sb.toString();
        System.out.println(res);
        System.out.println("len of the res string is : " + res.length());

        //substring
        String sub = res.substring(0, 6);
        System.out.println(sub);

        //substring search
        String theString = "is this good or is this bad?";
        int idx = theString.indexOf("good");
        System.out.println(idx);

        String substring = "is";
        int index = theString.indexOf(substring);
        while (index != -1) {
            System.out.println(index);
            index = theString.indexOf(substring, index + 1);
        }

        int last = theString.lastIndexOf(substring);
        System.out.println(last);

        //equals
        String one1 = "abc";
        String two2 = "def";
        String three3 = "abc";
        String four4 = "ABC";

        System.out.println(one1.equals(two2)); //false
        System.out.println(one1.equals(three3)); //true
        System.out.println(one1.equals(four4)); //false
        System.out.println(one1.equalsIgnoreCase(four4)); //ignore case so true

        //startsWith and endsWith
        one = "This is a good day to code";

        System.out.println(one.startsWith("This")); //true
        System.out.println(one.startsWith("This", 5)); //starts compare form index 5 so false

        System.out.println(one.endsWith("code")); //true
        System.out.println(one.endsWith("shower")); //false

        //compareTo
        one = "abc";
        two = "def";
        String three = "abd";
        String four = "abc";

        System.out.println(one.compareTo(two)); //-3 small
        System.out.println(one.compareTo(four)); //0 same
        System.out.println(one.compareTo(three)); //-1 small
        System.out.println(two.compareTo(three)); //3 greater

        //trim
        String text = "     The sting is going to Trim     ";
        System.out.println(text);
        String trimmed = text.trim(); // trim method return new String instance, does not modify the existing instance
        System.out.println(text); //text is not changed
        System.out.println(trimmed);

        //replace
        String source = "123@bc";
        System.out.println(source.replace('@', 'a'));

        //split
        source = "A man drove with a car.";
        String[] occurrences = source.split("a");
        System.out.println(Arrays.toString(occurrences));
        System.out.println(String.join("\n", occurrences)); // possible in java 8 only

        source = "A man drove with a car.";
        int limit = 2;
        occurrences = source.split("a", limit); // limit the split
        System.out.println(string.join("\n", occurrences));

        //converting number to string
        String intStr = String.valueOf(10);
        System.out.println("intStr = " + intStr);

        String fltStr = String.valueOf(3.1416);
        System.out.println("fltStr = " + fltStr);

        //convert object to String
        Integer integer = new Integer(73680);
        intStr = integer.toString();
        System.out.println("intStr = " + intStr);

        //char at
        theString = "This is a good day to code";

        System.out.println(theString.charAt(0));
        System.out.println(theString.charAt(3));

        //also get the byte representation of the String method using the getBytes() method.
        theString = "This is a good day to code";

        byte[] bytes1 = theString.getBytes();
        //byte[] bytes2 = theString.getBytes(Charset.forName("UTF-8");
        System.out.println(Arrays.toString(bytes1));

        //upper, lower
        theString = "This IS a mix of UPPERcase and lowerCASE";
        String uppercase = theString.toUpperCase();
        String lowercase = theString.toLowerCase();
        System.out.println(uppercase);
        System.out.println(lowercase);

        String Happy = "Happy Coding, Allhamdulillah :)";
        System.out.println((Happy));
    }
}
