package dsa_course_content;

// converting Decimal to binary
//10 to binary
//Num     Q   R
//10/2    5   0
//5/2     2   1     101 * 10 + 0 = 1010
//2/2     1   0     10 * 10 + 1 = 101 (now take answer from previous step)
//1/2     0   1     1 * 10 + 0 = 10 (combining both the steps current(0 - rem and mul by 10) and previous(1-rem))
//                    (start calculation from botton to top for generation of binary)
// ans would be 1010
public class RecursionDecimalToBinary {
    public static void main(String[] args)
    {
        int calculatedValue = decimalToBinary(10);
        System.out.println("calculated value : "+ calculatedValue);
    }
    public static int decimalToBinary(int num)
    {
        if(num == 0)
            return 0;
        else
        return num%2 + 10 * decimalToBinary(num/2);
    }

}
