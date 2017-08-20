package c;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        computeValue();
        computeValue1();
        computeValue2();
        computeValue3();
    }

    private static void computeValue()
    {
        System.out.println((0 + 15) / 2);//because is integer division.  15/2 = 7.5 gets truncated to 7

    }

    private static void computeValue1()
    {
        System.out.println((2.0e-6 * 100000000.1));//because is integer division.  15/2 = 7.5 gets truncated to 7

    }
    private static  void computeValue2()
    {
        System.out.println(true && false || true && true);
        /*evaluation is left associative so first term is true then next term is false BUT there is then an or so
checks that term - is true so then checks last term - is true so returns true.*/
    }
    private static void computeValue3()
    {
        System.out.println((1 + 2.236)/2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
    }


}
