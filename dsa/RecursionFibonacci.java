public class RecursionFibonacci {
    public static void main(String[] args)
    {
        var value = fibonacci(7);
        System.out.println(" fibonacci value : "+value);
    }
    public static int fibonacci(int n)
    {
        if( n < 0)
        {
            return -1;
        }
        if(n==0 || n ==1)
        {
            return n;
        }
        //System.out.println(" n = "+n+ " -----fibonacci value : "+fibonacci(n-1) + fibonacci(n-2));
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

