/**
 * Created by Ramanuja on 8/19/2017.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{23, 67, 12, 6, 55, 34, 80, 30, 10, 98};      // Array of size 10 elements
        findMax(a);
    }

    private static void findMax(int[] a)
    {

        double max = a[0]; //take first element as max element
        for (int i = 1; i < a.length; i++) //use a for loop to go trhough all elements of array
            if (a[i] > max)
                max = a[i]; // if an element is greater than max element, assign that element to max variable
        System.out.println(max);// print out the variable
    }

    private static void computeAverage(int[] a) {
        int N = a.length;//size of array is the total number of elements
        double sum = 0.0;//default value for sum
        for (int i = 0; i < N; i++)
            sum += a[i];//keeping adding all elements to sum
        double average = sum / N;//divide sum by size of array , total number of array elements
    }


}
