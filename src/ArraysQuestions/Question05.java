package ArraysQuestions;

public class Question05 {

    public static void main(String[] args) {

        /*

        Return the number of even ints in the given array.
        Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

        For Example:
        countEvenNums([2, 1, 2, 3, 4]) → 3
        countEvenNums([2, 2, 0]) → 3
        countEvenNums([1, 3, 5]) → 0

         */

        /*

        Verilen bir int arrayde kaç tane cift sayi oldugunu donduren bir method olusturun.
        % operatoru bolme isleminden kalani verir, 5%2=1 bu bölme isleminde kalan 1 dir.

        Ornegin:
        countEvenNums([2, 1, 2, 3, 4]) → 3
        countEvenNums([2, 2, 0]) → 3
        countEvenNums([1, 3, 5]) → 0

         */

        int[] arr1={24,13,46,37,45,56,73};
        int[] arr2={4,6,0,7,5,8,3};
        int[] arr3={1,3,5,7,9};

        System.out.println(countEvenNums(arr1)); // 3
        System.out.println(countEvenNums(arr2)); // 4
        System.out.println(countEvenNums(arr3)); // 0
    }

    public static int countEvenNums(int[] numbers){

        int count=0;

        for (int num:numbers) {
            if(num%2==0){
                count++;
            }
        }
        return count;
    }
}
