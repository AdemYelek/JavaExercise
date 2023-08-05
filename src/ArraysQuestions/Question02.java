package ArraysQuestions;

import java.util.Arrays;

public class Question02 {

    public static void main(String[] args) {

        /*

        Given an array of ints lenght 3, figure out which element is larger in the array,
        and set all the other elements to be that value.Return the changed array.

        Example:
        maxEndFirst([1,2,3])-[3,3,3]
        maxEndFirst([5,9,6])-[9,9,9]
        maxEndFirst([3,7,5])-[7,7,7]

         */

        /*
        In Turkish

        int lerden olusan ve uzunlugu 3 olan bir array verildiginde,bu arrayde hangi elemanin daha buyuk oldugunu belirleyip,
        hangisi daha buyukse arrayin tum elemanlarini ona esitleyen ve degismis arrayi yazdiran bir method olusturun.

        Ornek:
        maxEndFirst([1,2,3])-[3,3,3]
        maxEndFirst([5,9,6])-[9,9,9]
        maxEndFirst([3,7,5])-[7,7,7]

         */

        int[] arr1={3,7,5};
        System.out.println(Arrays.toString(maxEndFirst(arr1)));


    }

    public static int[] maxEndFirst(int[] arr){

        int max = 0;

        if(arr[0]>arr[1] && arr[0]>arr[2]){
            max=arr[0];
        }
        if (arr[1]>arr[0] && arr[1]>arr[2]) {
            max=arr[1];
        }
        if (arr[2]>arr[0] && arr[2]>arr[1]) {
            max=arr[2];
        }

        arr[0]=max;
        arr[1]=max;
        arr[2]=max;
        
        return arr;
    }
}
