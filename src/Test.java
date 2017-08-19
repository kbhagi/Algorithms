import java.util.Arrays;

/**
 * Created by Ramanuja on 8/19/2017.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{23, 67, 12, 6, 55, 34, 80, 30, 10, 98};      // Array of size 10 elements
        System.out.println(findMax(a));
        System.out.println(computeAverage(a));
        System.out.println(Arrays.toString(copyToAnotherArray(a)));
        System.out.println(Arrays.toString(reverseArray(a)));


    }

    private static double findMax(int[] a) {

        double max = a[0]; //take first element as max element
        for (int i = 1; i < a.length; i++) //use a for loop to go trhough all elements of array
            if (a[i] > max)
                max = a[i]; // if an element is greater than max element, assign that element to max variable
        return max; //return out the variable
    }

    private static double computeAverage(int[] a) {
        int N = a.length;//size of array is the total number of elements
        double sum = 0.0;//default value for sum
        for (int i = 0; i < N; i++)
            sum += a[i];//keeping adding all elements to sum
        double average = sum / N;//divide sum by size of array , total number of array elements
        return average;
    }

    private static int[] copyToAnotherArray(int source[]) {
        int N = source.length;//set the new size of array from current size of source array
        int[] dest = new int[N];//create a new array from source array
        for (int i = 0; i < N; i++)
            dest[i] = source[i];
        return dest;
    }

    private static int[] reverseArray(int[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) // loop till half of the array as we are swapping elements firt-last,second-second_last,third-third_last
        {
            int temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - i - 1] = temp;
        }
        return a;

    }


}
