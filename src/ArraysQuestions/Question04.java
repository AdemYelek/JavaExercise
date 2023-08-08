package ArraysQuestions;

import java.util.Arrays;

public class Question04 {

    public static void main(String[] args) {

        /*

        Given an int array, return a new array with double the length where its last element is the same as the original array,
        and all the other elements are 0. The original array will be length 1 or more.
        Note: by default, a new int array contains all 0's.

        For Example:

        makeLastIndex([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLastIndex([1, 2]) → [0, 0, 0, 2]
        makeLastIndex([3]) → [0, 3]

         */

        /*
        In Turkish

        Verilen int arrayin iki kati kadar elemani olan yeni bir array olusturup, yeni arrayin son elemanini eski arrayin
        son elemanina esitleyen ve geri kalan elemanlari 0 yapı yeni arrayi donduren bir method olusturun.
        Orijinal arrayin uzunlugu 1 yada daha fazla olsun.
        Not:Yeni bir array olusturdugunuzda default olarak o arrayin tum elementleri 0 olur.

        Ornegin:

        makeLastIndex([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLastIndex([1, 2]) → [0, 0, 0, 2]
        makeLastIndex([3]) → [0, 3]

         */

        int[] arr1={5,8,9,3,7}; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 7]
        int[] arr2={3,6,8}; // [0, 0, 0, 0, 0, 8]
        int[] arr3={9}; // [0, 9]

        System.out.println(Arrays.toString(makeLastIndex(arr1)));
        System.out.println(Arrays.toString(makeLastIndex(arr2)));
        System.out.println(Arrays.toString(makeLastIndex(arr3)));
    }

    public static int[] makeLastIndex(int[] arr){
        int[] newArr= new int[arr.length*2];
        newArr[newArr.length-1]=arr[arr.length-1];

        return newArr;
    }
}
