package dsa_course_content;

//product of Array
//        Write a function called productOfArray which takes in an array of numbers and returns the product of them all.
//        Examples
//        int arr[] = { 1, 2, 3, 4, 5 };
//        productofArray(arr, arr.length); #120
public class ProductOfArray {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int calculatedValue = arrayProduct(arr, n);
        System.out.println("calculated value : "+ calculatedValue);
    }
    public static int arrayProduct(int arr[], int n)
    {

        if(n <= 0)
            return 1;
        else
            return arr[n-1] * arrayProduct(arr,n-1);

    }
}
