package dsa_course_content;

public class test {

    public static void main(String[] args)
    {
        int calculatedValue = fib(5);
        System.out.println("calculated Value : "+ calculatedValue);
    }
    public static int fib(int n) {
        // TODO
         if(n<0)
             return -1;
        if(n==0 || n==1)
            return n;
        else
        {
            int val =  fib(n-1) + fib(n-2);
            System.out.println("value = "+val);
            return val;
        }



    }

}
