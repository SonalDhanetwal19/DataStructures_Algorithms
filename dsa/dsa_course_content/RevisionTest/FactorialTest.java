package dsa_course_content.RevisionTest;

public class FactorialTest {
    public static void main(String[] args)
    {
        int calculatedValue = factorial(6);
        System.out.println(" calculated factorial value = "+ calculatedValue);
    }
    public static int factorial(int num)
    {
        if(num == -1)
            return -1;
        if(num == 0)
            return 1;
        else
            return num * factorial(num-1);
    }
}
