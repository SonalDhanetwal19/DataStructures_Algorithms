package dsa_course_content;

//finding sum of digits using recursion
public class RecursionSumOfDigits {
    public static void main(String[] args) {
        int calculatedValue = recursiveSumOfDigits(43556768);
        System.out.println(" calculatedValue : " + calculatedValue);
    }

    public static int recursiveSumOfDigits(int num) {
        if (num > 0) {
            int sumVal = num % 10 + recursiveSumOfDigits(num / 10);
            return sumVal;
        } else return 0;

    }


}
