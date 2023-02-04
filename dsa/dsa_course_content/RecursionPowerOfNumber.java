package dsa_course_content;

//calculating raised to the power of number through recursion
public class RecursionPowerOfNumber {
    public static void main(String[] args)
    {
        int calculatedValue = powerOfNumber(9,5);
        System.out.println("calculatedValue : "+calculatedValue);
    }
    public static int powerOfNumber(int base, int exp)
    {
        if(exp == 0)
            return 1;
        else if (exp < 0) {
            return -1;
        }
        else {
            int result = base * powerOfNumber(base, exp - 1);
            return result;
        }
    }
}
