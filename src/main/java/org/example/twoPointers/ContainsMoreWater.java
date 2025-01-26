package org.example.twoPointers;

public class ContainsMoreWater {

    public static void main(String[] args){
        int[] water = {1,2,5,6,3,7};
        System.out.println(maxArea(water));
    }

    //Brute force
    /*public static int maxArea(int[] height) {
        int maxArea = 0;
        for(int i =0;i<height.length;i++){
            for(int j =i+1;j<height.length;j++){
                int area = Math.min(height[i],height[j]) * (j-i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }*/

    //Optimized approach
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
            while(left < right){
            int area = Math.min(height[left],height[right]) * (right -left);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            maxArea = Math.max(area, maxArea);
        }
            return maxArea;
    }
}
