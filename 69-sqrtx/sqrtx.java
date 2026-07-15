class Solution {
    public int mySqrt(int x) {
      int left = 0, right = x;
      while(left <= right){
        int mid = left+(right - left)/2;

        long ans = (long)mid * (long)mid;
        if(ans <= (long)x){
            left = mid+1;
        }else{
            right = mid-1;
        }
      }
      return right;
    }
}