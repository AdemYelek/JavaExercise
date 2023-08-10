public class Question07 {

    /*

    Return the sum of the numbers in the array, returning 0 for an empty array.
    Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

    For Example :

    sumExcept13([5,9,13,6,3,13,24]) → 17
    sumExcept13([13,34,21,7,13,42,3]) → 31
    sumExcept13([12,5,4,8,13]) → 29

     */

    /*

    In Turkish

    Verilen bir int arrayindeki sayilarin toplamını yazdiran bir method olusturun,Ancak 13 sayısı çok şanssız olduğundan
    13 u ve 13 ten sonra gelen sayiyi toplama katmayin.

    Ornegin :

    sumExcept13([5,9,13,6,3,13,24]) → 17
    sumExcept13([13,34,21,7,13,42,3]) → 31
    sumExcept13([12,5,4,8,13]) → 29

     */

    public static void main(String[] args) {

        int[] arr1={5,9,13,6,3,13,24};
        int[] arr2={13,34,21,7,13,42,3};
        int[] arr3={12,5,4,8,13};

        System.out.println(sumExcept13(arr1)); // 17
        System.out.println(sumExcept13(arr2)); // 31
        System.out.println(sumExcept13(arr3)); // 29
    }

    public static int sumExcept13(int[] numbers){

        int total=0;

        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] != 13){
                total+=numbers[i];
            }else {
                i++;
            }
        }
        return total;
    }
}
