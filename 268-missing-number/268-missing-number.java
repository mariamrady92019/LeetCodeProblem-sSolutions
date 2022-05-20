class Solution {
    public int missingNumber(int[] nums) {
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
        
        //search
        int left = 0;
        int right = nums.length;;
        int counter=0;
        while(left<right){
            int mid=left+(right-left)/2;
            
            for(int i = left ; i<=mid ;i++){

                if(counter!=nums[i])
                return counter;
                counter ++;
            }
            left=mid+1;
        }
       return nums.length; 
    }
}