class Solution {
    public int firstocc(int nums[], int target){
        int n = nums.length;
        int first = -1;
        int left = 0, right = n-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                first = mid;
                right = mid -1;
            }else if(nums[mid] < target){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return first;
  }

   public int lastocc(int nums[], int target){
        int n = nums.length;
        int last = -1;
        int left = 0, right = n-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                last = mid;
                left = mid +1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return last;
  }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1, last = -1;
        int firstone = firstocc(nums, target);
        int lastone = lastocc(nums, target);
            return new int[]{firstone, lastone};
        }
    }