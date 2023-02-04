package dsa_course_content;

public class RecursiveIsPalindrome {
    public static void main(String[] args)
    {
        System.out.println("ispalindrome : "+isPalindrome("nitin"));
    }
    public static boolean isPalindrome(String s)
    {
        // TODO
        if(s != null)
        {

            if(s.length() == 0 || s.length() == 1)
                return true;
            System.out.println("s = "+s);
            if(s.charAt(0) == s.charAt(s.length()-1) )
            {

                return isPalindrome(s.substring(1,s.length()-1));
                // else return false;
            }
            else
                return false;
        }
        else
            return false;

    }

}
