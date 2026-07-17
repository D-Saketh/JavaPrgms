class Solution {
    public int findMax(int nums[]){
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int calculateTotalHours(int nums[], int hr){
        int val = 0;
        for(int i=0; i<nums.length; i++){
           val += Math.ceil((double)nums[i] / (double)hr);
        }
        return val;
    }

    public int minEatingSpeed(int[] nums, int h) {
        int left = 0, right = findMax(nums);
        while(left <= right){
            int mid = (left+right)/2;
            long val = calculateTotalHours(nums, mid);
            if(val <= h){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return left;
    }
}