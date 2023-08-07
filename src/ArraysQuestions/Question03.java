package ArraysQuestions;

public class Question03 {

    public static void main(String[] args) {

        /*

        Given an array of ints,return the sum of the first 2 elements in the array.If the array lenght
        is less than 2,just sum up the elements that exist,returning 0 if the array lenght 0.

        For Example :
        sum([1,2,3]) - 3
        sum([1]) - 1
        sum([2,2,2,2]) - 4
        sum([]) - 0

         */

        /*

        In Turkish

        Int lerden olusan bir array verildiginde arrayin ilk iki elementinin toplamini donduren bir method
        olusturun.Bu method eger arrayin uzunlugu 2 den daha az ise var olan elementi,eger arrayin uzunlugu 0 ise 0
        dondursun.

        Ornegin :
        sum([1,2,3]) - 3
        sum([1]) - 1
        sum([2,2,2,2]) - 4
        sum([]) - 0

         */

        int[] arr1={5,2,3}; // 7
        int[] arr2={7}; // 7
        int[] arr3={2,9,2,2}; // 11
        int[] arr4={}; // 0

        System.out.println(sum(arr4));


    }

    public static int sum(int[] arr) {

        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            return arr[0] + arr[1];
        }
    }
}
