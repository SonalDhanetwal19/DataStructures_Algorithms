public class RecursionFactorialExample {
    public static void main(String[] args)
    {
        var value = fibonacci(5);
        System.out.println("factorial_value : "+value);
    }
    public static int fibonacci(int n)
    {
        System.out.println(" n = "+ n);
        if(n < 0)
            return -1;
        if(n==0 || n==1) {
            return 1;
        }
        return n * fibonacci(n - 1);
    }
}
