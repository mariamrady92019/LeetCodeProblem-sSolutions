class Solution {
    public boolean containsDuplicate(int[] nums) {
        

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