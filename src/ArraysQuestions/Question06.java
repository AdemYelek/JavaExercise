package ArraysQuestions;

import java.util.Arrays;

public class Question06 {

    /*

    Return the "centered" average of an array of ints,
    which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array.
    If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
    Use int division to produce the final average. You may assume that the array is length 3 or more.

    For Example :

    averageOfCenteredValues([2,5,7,24,87]) → 12
    averageOfCenteredValues([1,1,5,5,10,8,7]) → 5
    averageOfCenteredValues([-10,-4,-2,-4,-2,0]) → -3

     */

    /*

    In Turkish

    Int lerden olusan arrayin en buyuk ve en kucuk degerini gözardı ederek diger degerlerin ortalamasını donduren bir method
    olusturun.
    Eger en kucuk degerin birden fazla kopyasi varsa yalnızca bir tanesini gormezden gelin,aynı sekilde buyuk deger
    icinde bu sekilde hareket edin.
    Sonuc ortalaması icin int bolme kullanın ve arrayin uzunlugunun 3 veya daha fazla oldugunu
    varsayin

    Ornegin :

    averageOfCenteredValues([2,5,7,24,87]) → 12
    averageOfCenteredValues([1,1,5,5,10,8,7]) → 5
    averageOfCenteredValues([-10,-4,-2,-4,-2,0]) → -3

     */

    public static void main(String[] args) {

        int[] arr1 = {2, 24, 7, 5, 87};
        int[] arr2 = {1,1,5,5,10,8,7};
        int[] arr3 ={-10,-4,-2,-4,-2,0};



        // System.out.println(averageOfCenteredValues(arr1)); // 12
        // System.out.println(averageOfCenteredValues(arr2)); // 5
        System.out.println(averageOfCenteredValues(arr3)); // -3


    }

    public static int averageOfCenteredValues(int[] numbers) {

        int total = 0;

        Arrays.sort(numbers);
        System.out.println("Sorted state of array : " + Arrays.toString(numbers));

        for (int num : numbers) {
            total += num;
        }

        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        return (total - (min + max)) / (numbers.length - 2);
    }
}
