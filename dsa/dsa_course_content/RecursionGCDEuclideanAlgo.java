package dsa_course_content;

//calculating GCD (Greatest common divisor) through Euclidean method
//Normal method:
//GCD(8,4) 8 = 2*2*2
//         4 = 2*2
//GCD - 4 (2*2)
//------------------------
//Euclidean method:
//GCD(48,18)
//STEP 1: 48%18 = remainder 12   (48/18 = Q - 2, R - 12)
//STEP 2: 18%12 = remainder 6    (18/12 = Q - 1, R - 6)
//STEP 3: 12%6 = remainder 0      (12/6 = Q - 2, R - 0)
//Algo => gcd(a,b) = gcd(b, a mod b)
//        gcd(a,0) = a

public class RecursionGCDEuclideanAlgo {
    public static void main(String[] args)
    {
        int calculatedGCD = calculateGCD(99, 66);
        System.out.println(" calculated GCD : "+calculatedGCD);
    }
    public static int calculateGCD(int a, int b)
    {
        if(a < 0 || b < 0)
            return -1;
        else if(b == 0)
            return a;
        else {
//            below commented lines will also give the same result
//            int gcdValue = calculateGCD(b, a % b);
//            return gcdValue;
            return calculateGCD(b, a % b);
        }
    }
}

