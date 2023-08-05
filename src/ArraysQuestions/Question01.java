package ArraysQuestions;

import java.util.Arrays;

public class Question01 {

    public static void main(String[] args) {

        /*

        Given an array of ints;return true if 6 appears as either the first or last element in the array.
        The array will be lenght 1 or more.

        Example :
        firstLast6([1,2,3,4,5,6])- true
        firstLast6([2,3,4,5])- false

         */

        /*
        In Turkish

        int lerden olusan bir array verildiginde,eger 6 sayisi arrayin ilk veya son sayisi ise true donduren,
        degilse false donduren bir method olusturun.Arrayin uzunlugu 1 veya daha fazla olacak.

        Ornek :
        firstLast6([1,2,3,4,5,6])- true
        firstLast6([2,3,4,5])- false

         */

        int[] arr ={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(firstLast6(arr));

    }

    public static boolean firstLast6(int[] numbers) {
        if (numbers[0] == 6 || numbers[numbers.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}
