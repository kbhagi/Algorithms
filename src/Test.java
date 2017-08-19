/**
 * Created by Ramanuja on 8/19/2017.
 */
public class Test {
    public static void main(String[] args) {
       findMax();
    }

    private static void findMax()
    {
        int [] a = new int [] {23,67,12,6,55,34,80,30,10,98}; // Array of size 10 elements
        double max = a[0]; //take first element as max element
        for (int i = 1; i < a.length; i++) //use a for loop to go trhough all elements of array
            if (a[i] > max)
                max = a[i]; // if an element is greater than max element, assign that element to max variable
        System.out.println(max);// print out the variable
    }
}
