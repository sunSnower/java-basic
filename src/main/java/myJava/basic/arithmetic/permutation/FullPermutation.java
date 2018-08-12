package myJava.basic.arithmetic.permutation;

/**
 * 字符串全排列
 *
 */
import java.util.Arrays;

public class FullPermutation {
    static int count = 0;

    char[] arr;
    FullPermutation(char[] arr){
        this.arr = arr;
    }

    public void fullPermutation(int from, int to){
        if(to <= 0){
            return;
        }

        if(from == to){
            System.out.println(Arrays.toString(arr));
            count++;
        }
        else{
            for(int index = from; index <= to; index++){
                swap(index, from);
                fullPermutation(from+1, to);
                swap(index, from);
            }
        }
    }
    public void swap(int li, int ri){
        char tempValue = arr[li];
        arr[li] = arr[ri];
        arr[ri] = tempValue;
    }

    public static void main(String[] args){
        String s = "abcdefg";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        new FullPermutation(arr).fullPermutation(0, arr.length-1);
        int sum = 1;
        for(int i = s.length(); i >= 1; i--){
            sum *= i;
        }
        System.out.println(count +" "+ sum);

        System.out.println((8 >>> 3) + " " + (8 ^ 5));
    }
}
