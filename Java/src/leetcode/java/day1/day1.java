package leetcode.java.day1;

import java.sql.SQLOutput;

//删除排序数组中的重复项
public class day1 {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int sum=0;
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i]!=nums[j]){
                i=j;
                sum++;
            }
        }
        return 0;
    }


    public int removeDuplicates1(int[] nums) {
        if (nums.length==0){
            return 0;
        }else if (nums.length==1){
            return 1;
        }else {
            int i=0;
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]!=nums[j]){
                    i++;
                    nums[i]=nums[j];
                }
            }
            return i+1;
        }
    }
}