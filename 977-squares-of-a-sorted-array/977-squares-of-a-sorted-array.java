class Solution {
    public int[] sortedSquares(int[] nums) {
        //square the array
        for (int i = 0 ; i<nums.length;i++){
            nums[i]=nums[i]*nums[i];}
        //sort
           int value , value2 = 0 ;
        for(int i = 0; i<nums.length;i++){
            value =nums[i]; //16
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){// 1<16 0<1
                   value2=nums[j];
                    nums[i]=nums[j];
                    nums[j]=value;
                    value = value2;
                }
            }
        }
        
      return nums;  
        
    }
}