package org.example.twoPointers;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    public static int[] twoSum(int[] nums, int target) {

        //Brute Force
       /* Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i =0;i<nums.length;i++){
            int numbToFind = target-nums[i];
            if(hashMap.containsKey(numbToFind)){
                return new int[]{hashMap.get(numbToFind), i};
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return new int[0];
    }
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                   return  new int[]{i,j};
                }
            }
        }
        return new int[0];*/

        //2 pointer approach
        int numsArray[][] = new int[nums.length][2];
        for(int i =0;i<nums.length;i++){
            numsArray[i][0] = nums[i];
            numsArray[i][1] = i;
        }
        Arrays.sort(numsArray, (a, b) -> Integer.compare(a[0],b[0]));
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = numsArray[left][0] + numsArray[right][0];
            if (sum == target) {
                return new int[]{numsArray[left][1], numsArray[right][1]};
            }else if (sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        return new int[0];
    }

}