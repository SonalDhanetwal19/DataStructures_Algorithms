package iteration;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        arrReverse(arr);
        System.out.println(" reversed array : "+ Arrays.toString(arr));
    }
    public static void arrReverse(int[] arr)
    {
        for (int i = 0; i <= arr.length/2; i++)
        {
            int end = arr[arr.length - i -1];
            int start = arr[i];
            arr[i] = end;
            arr[arr.length - i -1] = start;
        }

    }
}
