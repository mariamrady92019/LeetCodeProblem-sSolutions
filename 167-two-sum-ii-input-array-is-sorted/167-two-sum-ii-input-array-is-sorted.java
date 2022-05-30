class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
           Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< numbers.length; i++) {
            if(map.containsKey(target - numbers[i])){
                return new int[]{map.get(target - numbers[i])+1, i+1};
            }else {
                map.put(numbers[i], i);
            }
        }
        return new int[]{-1,-1};
//         int[] arr =new int[2];
        
//         for(int i = 0 ; i<numbers.length; i++){
          
//             for(int k = i+1; k<numbers.length ;k++){
                
                
//                 if((numbers[i]+numbers[k])==target)
//                 { 
//                        arr[0]=i+1;
//                        arr[1]=k+1;
//                     return arr ;
              
//                 }
//             }
            
//         }
        
        
//        return arr ; 
        
        
        
    }
}