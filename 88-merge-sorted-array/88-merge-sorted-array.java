import java.util.Arrays;
class Solution {
 public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    
     for(int i = 0 ; i<n;i++){
         nums1[m+i]=nums2[i];
     }
     
       Arrays.sort(nums1);
    //  nums2=nums1;
      // nums1=arr;
       System.out.println(Arrays.toString(nums1));
    
    }
}