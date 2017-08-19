/**
 * Created by Ramanuja on 8/19/2017.
 */
public class Test {
    public static void main(String[] args) {
        int [] a = new int [] {23,67,12,6,90,34}; // Test data to check the code
     double max=a[0];
     for(int i=1;i<a.length;i++)
         if(a[i]>max) max=a[i];
        System.out.println(max);
    }
}
