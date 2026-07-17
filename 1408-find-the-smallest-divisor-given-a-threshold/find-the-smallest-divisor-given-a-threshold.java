class Solution {
    public int helperfunc(int nums[], int limit){
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans += Math.ceil((double)nums[i]/(double)limit);
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int limit) {
        int n = nums.length;
        if(n > limit) return -1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
        }

       int left = 1, right = max;
       while(left <= right){
        int mid = (left+right)/2;
        if(helperfunc(nums, mid) <= limit){
            right = mid -1;
        }else{
            left = mid+1;
        }
       }
       return left;
    }
}