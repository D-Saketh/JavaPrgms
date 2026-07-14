class Solution {
    public int search(int[] nums, int k) {
       int n = nums.length;
       int left = 0, right = n-1;
       while(left <= right){
        int mid = (left + right)/2;

        if(nums[mid] == k){
            return mid;
        }
        if(nums[left] <= nums[mid]){
            if(nums[left] <= k && k <= nums[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        else{
            if(nums[mid] <= nums[right]){
                if(nums[mid] <= k && k <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
       }
        return -1;
       
    }
}
