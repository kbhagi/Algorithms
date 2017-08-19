package me.bhargavak;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
            int [] a = new int [] {489910,
                    18940,774392
                    ,490636
                    ,125544,407391,115771,992663,923282,176914,217904,571222,519039,395667};
        Arrays.sort(a);//Sort the array in ascending order before searching
        System.out.println(rank(176914,a));// pass the element to search & reference of array

    }
    public static int rank(int key,int[]a)
    {
        int lo=0;int hi=a.length-1;
        while (lo<=hi)
        { // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo ) /2;// Set the mid value to be at exactly at middle of an array
            if (key < a[mid]) hi = mid - 1; // If key less than mid value set high to mid - 1
            else if (key > a[mid]) lo = mid + 1;// else If key greater than mid value set low to mid + 1
            else return mid; // else key element matches mid element
    }
    return  -1;
    }


}


