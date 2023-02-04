package dsa_course_content.RevisionTest;

public class RecursionPowerTest {

    public static void main(String[] args)
    {

        int updatedValue = power(2, -5);
        System.out.println(" power of base : "+ updatedValue);
    }
    public static int power(int base, int exponent) {
        // TODO
        // var updatedValue = calculatePower(2, 5);

        if (exponent < 0)
            return -1;
        if(exponent == 0)
            return 1;
        else {
            int val = base * power(base, exponent - 1);
            System.out.println(" val : " + val);
            return val;
        }
    }

}
