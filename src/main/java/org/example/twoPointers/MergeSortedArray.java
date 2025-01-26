package org.example.twoPointers;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
        int[] arr = {2,4,7};
        int[] arr1 = {5,5,9};

        System.out.println(Arrays.toString(merge(arr,3,arr1,3)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int[] result = new int[m+n];
        for(int i =0;i<nums1.length;i++){
            result[index++] = nums1[i];
        }
        for(int j =0;j<nums2.length;j++){
            result[index++] = nums2[j];
        }
        Arrays.sort(result);
        return result;
    }
}
