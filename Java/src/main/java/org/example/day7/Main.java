package org.example.day7;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        int[] arr = {2,6,1,5,8,3};
        System.out.println("Min="+minMax.getMin(arr));
        System.out.println("Max="+minMax.getMax(arr));
        System.out.println();
        System.out.println(Arrays.toString(new ReverseArray().reverse(new int[] {1,2,3,4,5})));
        System.out.println();
        System.out.println(Arrays.toString(new Rotate().rotate(new int[] {1,2,3,4,5,6,7}, 2)));
        System.out.println();
        System.out.println(Arrays.toString(new Sort().sort(new int[] {3,6,2,7,4,8,1})));
        System.out.println();
        System.out.println(new Search().search(new int[] {3,6,2,7,4,8,1}, 4));


    }
}