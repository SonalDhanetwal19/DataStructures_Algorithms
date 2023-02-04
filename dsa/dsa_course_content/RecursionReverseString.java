package dsa_course_content;

public class RecursionReverseString {
    public static void main(String[] args) {
        String rev = reverse("Sonal");
        System.out.println("rev = " + rev);
    }

    public static String reverse(String str) {

        if (!str.substring(1).isEmpty() || str.length() > 1) {
            System.out.println(str.substring(1) + str.charAt(0));
            return reverse(str.substring(1)) + str.charAt(0);
        } else if (str == null) {
            return str;
        } else return str;
    }
}
