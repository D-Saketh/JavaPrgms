class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int arr3[] = new int[nums1.length + nums2.length];
     for(int i=0; i<nums1.length; i++){
        arr3[i] = nums1[i];
     }
     for(int i=0; i<nums2.length; i++){
        arr3[nums1.length+i] = nums2[i];
     }

     Arrays.sort(arr3);
     int n = arr3.length;

     if(n % 2 != 0){
        return arr3[n/2];
     }
     return (arr3[n/2 -1] + arr3[n/2 ])/2.0;
    }
}
