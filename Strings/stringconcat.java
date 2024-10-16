package Strings;

public class stringconcat {
    public static void main(String[] args) {
        // String concatenation
        String name = "Shadab";
        String lastname = "khan";
        String fullname = name + " " + lastname;
        name += lastname + name;
        System.out.println(lastname + name);

        System.out.println(fullname);
    }

}
