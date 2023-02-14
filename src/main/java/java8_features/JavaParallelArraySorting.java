package java8_features;

import java.util.Arrays;

public class JavaParallelArraySorting {

    public static void main(String[] args) {
        int[] intArr = {1, 9, 6, 7, 3, 2, 4, 5, 8};
        Arrays.parallelSort(intArr);
        for (int i : intArr) {
            System.out.println(i);
        }
        System.out.println("======== Sort 0~4 =================");

        String[] arr = {"A", "X", "B", "C", "Z", "Y"};
        Arrays.parallelSort(arr, 0, 4);
        for (String s : arr) {
            System.out.println(s);
        }
    }

}
