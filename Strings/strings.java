package Strings;

public class strings {
    public static void main(String[] args) {

        String S1 = "Welcome";
        String S2 = new String("Welcome");
        String S3 = "Welcome";
        String S4 = "WELCOME";
        System.out.println(S1.length());// prints the length of the string...
        System.out.println(S1.charAt(1));// to find the positions of the given characters
        System.out.println(S1.charAt(4));
        System.out.println(S1.indexOf('w'));
        System.out.println(S1.indexOf('e'));
        System.out.println(S1.lastIndexOf('e'));
        System.out.println(S1 == S3);
        System.out.println(S1 == S2);
        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S3));

        System.out.println(S1.equalsIgnoreCase(S4));// ignores the cases
        System.out.println(S1.equals(S4));
        System.out.println(S4.toLowerCase());// converts char to lower case
        System.out.println(S1.toUpperCase());// converts char to upper case

        System.out.println(S1.startsWith("come"));// check starts or ends with given string it returns in boolean type(T
                                                  // or F).....
        System.out.println(S1.endsWith("come"));

        System.out.println(S1.isEmpty());// to check string is empty or not (T or F).
        System.out.println(S1.contains("come")); // to check whether the string is present or not (T or F).

        System.out.println(S1.replace("come", "bye")); // replaces old char/string with new char/string......

        System.out.println(S1.substring(1));
        System.out.println(S1.substring(1, 5));

        System.out.println(S1.concat(" to java"));

    }

}
