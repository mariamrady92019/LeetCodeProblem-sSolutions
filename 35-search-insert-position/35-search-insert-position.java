class Solution {
    public int searchInsert(int[] nums, int target) {
        
      int inOrder =0; 
        
        for(int i = 0 ; i<nums.length;i++){
            
            if(nums[i]==target)
                return i ;
            else{
                if(i==nums.length-1&&nums[i]<target){
                    return i+1;
                }
                if(nums[i]<target&&nums[i+1]>target)
                    inOrder=i+1;
            }
            
        }
        
      return inOrder;  
    }
}