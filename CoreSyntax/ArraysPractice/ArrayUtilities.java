// package ArraysPractice;
import java.util.Arrays;

public class ArrayUtilities {
    public static void main(String[] args){
        int[] numbers = {22,1,32,34,67,86,33};

        // 1. Print array contents directly
        System.out.println("Orignal: "+Arrays.toString(numbers));


        // 2. Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted: "+Arrays.toString(numbers));

    }
}
