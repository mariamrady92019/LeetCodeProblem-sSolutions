class Solution {
    public int search(int[] nums, int target) {
        int mid=0;
        if(nums.length>=2){
         mid = (nums.length/2)-1;
        }
        
        if(nums[mid]==target)
            return mid;
        else if(target<nums[mid]){
            
          for(int i = 0 ; i<mid;i++){
              if(nums[i]==target){
                  return i;
              }
          }  
            
        }else{
            
          for(int j =mid ; j<nums.length;j++){
              if(nums[j]==target){
                  return j;
              }
          }   
        }
        
        return -1 ;
        
    }
}