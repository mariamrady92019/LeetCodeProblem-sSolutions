class Solution {
    public int maxSubArray(int[] arr) {
          //Assign first value of an array
         int maxSum = arr[0];
         int sum = arr[0];
 
         //Traverse an array
         for(int i = 1; i < arr.length; i++) {
             
             if(sum < 0) {
                sum = arr[i];
             } else {
                sum = sum + arr[i];
             }
              
             //get maxsum
             maxSum = Math.max(sum, maxSum);
        }
       
         return maxSum;
        
        
        
        //naive method --> nested loop 
//                 int maxSum = Integer.MIN_VALUE;
//         int sum = 0;
 
//         // do for each subarray starting with `i`
//         for (int i = 0; i < nums.length; i++)
//         {
//             // calculate the sum of subarray `nums[i…j]`
 
//             sum = 0;    // reset sum
 
//             // do for each subarray ending at `j`
//             for (int j = i; j < nums.length; j++)
//             {
//                 sum += nums[j];
 
//                 // if the current subarray sum is greater than the maximum
//                 // sum calculated so far, update the maximum sum
//                 if (sum > maxSum) {
//                     maxSum = sum;
//                 }
//             }
//         }
 
//         return maxSum;
    }
}