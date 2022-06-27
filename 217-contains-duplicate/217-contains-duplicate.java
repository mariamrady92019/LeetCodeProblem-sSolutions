class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
// first sort --> then compare two elements if equals then return
//          int i;
//         Arrays.sort(nums);
//         for(i=0;i<nums.length-1;i++)
//         {
//             if(nums[i]==nums[i+1])
//             return true;
//         }
//         return false; 
        
        //-------------------

             Map<Integer, Integer> hm
            = new HashMap<Integer, Integer>();
       
  
        
        
        for(int i = 0 ; i<nums.length ; i++){
         
            if(hm.containsKey( Integer.valueOf(nums[i]))==false){
                System.out.println(hm.containsKey(Integer.valueOf(nums[i])));
                
                  hm.put(Integer.valueOf(nums[i]), Integer.valueOf(1));
                     System.out.println(Integer.valueOf(i));
            }else{
                return true;
            }
            
            
        }
        return  false;  
    }
}