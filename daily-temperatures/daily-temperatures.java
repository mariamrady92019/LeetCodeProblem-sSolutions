class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
//              int[] ans = new int[temperatures.length];
            
//             for (int i = 0; i < temperatures.length-1; i++) {
//                 if(temperatures[i+1]>temperatures[i]){
//                 ans[i]=1;
//                 continue;
//                 }else{
                
//                     for (int j = i+1; j < temperatures.length; j++) {
//                              if(temperatures[j]>temperatures[i]){
//                                  ans[i]=j-i;
//                                  break;
//                              }
                        
//                     }
                    
                
//                 }
                
                
//             }
//         return ans;
        
        
//           int[] ans = new int[temperatures.length];
//             Stack<Integer> stackk = new Stack();
//             int c = 0 ;
//             for(int i = temperatures.length-1; i >=0; i--) {
//               int temp = temperatures[i];
              
//               if(stackk.isEmpty()){
//                  stackk.push(temp);
//                  ans[i]=0;
//               }else{
                  
//                 if(temperatures[i]>=stackk.peek()){
//                      c= 0 ;
//                     while (stackk.isEmpty()==false) {
//                       c++;
//                       stackk.pop();
//                       if(!stackk.isEmpty()&&temperatures[i]<stackk.peek()){
//                       c++;
//                      ans[i]=c;
                          
//                       stackk.push(temperatures[i]);
//                              break;  
//                       }else if (stackk.isEmpty()){
//                         ans[i] = ++c;                           
//                       }
                      
//                          }
             
                            
//                 }else{
//                 stackk.push(temp);
//                 ans[i]=1;
                
//                 }
                  
                  
                  
              
//               }
                
//             }
            
            
//              return ans;
        
         int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        
        int ans[] = new int[temperatures.length];
        
        for(int curr_day = 0; curr_day < n ; curr_day++){
            
            int curr_temp = temperatures[curr_day] ;
            while(!stack.isEmpty() && temperatures[stack.peek()] < curr_temp ){
                int prev_day = stack.pop();
                ans[prev_day] = curr_day - prev_day;
            } 
            stack.push(curr_day);
        }
        
        return ans;
    
}}