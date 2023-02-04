package dsa_course_content;

public class RecursionFirstUppercaseChar {

    public static void main(String[] args)
    {
        char upCase = first("abcdeFghI");
        System.out.println("first upper case : "+upCase);
    }
    static char first(String str) {
        //   TODO


        if(!Character.isUpperCase(str.charAt(0)) && str != null)
        {
            //System.out.println(" check : "+first(str.substring(1)));

            return first(str.substring(1));
        }
        else
            return str.charAt(0);
    }
}
