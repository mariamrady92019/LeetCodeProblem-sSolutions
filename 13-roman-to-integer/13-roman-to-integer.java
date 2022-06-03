import java.util.HashMap;
import java.util.Map;
import java.lang.Object;

   // java.lang.Number
class Solution {
    public int romanToInt(String s) {
         
            // Creating an empty HashMap
     
         // Creating an empty HashMap
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
  
        // Inserting pairs in above Map
        // using put() method
        hm.put("I", Integer.valueOf(1));
        hm.put("V", Integer.valueOf(5));
        hm.put("X", Integer.valueOf(10));
        hm.put("L",Integer.valueOf(50));
        hm.put("C",Integer.valueOf(100));
        hm.put("D",Integer.valueOf(500));
        hm.put("M",Integer.valueOf(1000));
  
        
         int sum =0;
        int value=0;
        for(int i = 0 ; i<s.length();i++){
             String c =String.valueOf(s.charAt(i));  
          if((Integer)hm.get(c)>=1){
                value=(Integer)hm.get(c);
                   System.out.println("mnugiyfc");
            if(i+1<s.length()&&(Integer)hm.get(c)<(Integer)hm.get(String.valueOf(s.charAt(i+1)))){
              
             value = -1*value;
            
          }
                      sum=sum+value;

          }
        }
              System.out.println(sum);

        return sum;
    }
}