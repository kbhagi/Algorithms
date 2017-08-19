/**
 * Created by Ramanuja on 8/19/2017.
 */
public class Test {
    public static void main(String[] args) {
       findMax();
    }
    public  static void findMax()
    {
        int [] a = new int [] {23,67,12,6,55,34,80,30,10,98}; // Array of size 10 elements
        double max=a[0];
        for(int i=1;i<a.length;i++)
            if(a[i]>max) max=a[i];
        System.out.println(max);
    }
}
