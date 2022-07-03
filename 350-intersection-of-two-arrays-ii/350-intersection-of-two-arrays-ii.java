import java.util.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
//         Map<Integer, Integer> hm
//             = new HashMap<Integer, Integer>();
    
//        for(int i =0; i<nums1.length;i++){
           
//             if(hm.containsKey( Integer.valueOf(nums1[i]))==false){
                
//                   hm.put(Integer.valueOf(nums1[i]), Integer.valueOf(1));
//        }else{
            
// hm.put(
//     Integer.valueOf(nums1[i]),
//     Integer.valueOf(hm.get(Integer.valueOf(nums1[i]) )+1));    
                
    
           
           
//     }
// }
        
//          List<Integer> result = new ArrayList<Integer>();
        
//          for(int i = 0; i < nums2.length; i++){
//         if(hm.containsKey(nums2[i]))
//             result.add(nums2[i]);}
        
// //           Map<Integer, Integer> hm2
// //             = new HashMap<Integer, Integer>();
    
// //    for(int i =0; i<nums2.length;i++){
           
// //             if(hm2.containsKey( Integer.valueOf(nums2[i]))==false){
                
// //                   hm2.put(Integer.valueOf(nums2[i]), Integer.valueOf(1));
// //        }else{
            
// // hm2.put(
// //     Integer.valueOf(nums2[i]),
// //     Integer.valueOf(hm2.get(Integer.valueOf(nums2[i]) )+1));    
                
    
           
           
// //     }
// // }
       
// //         int z = 0 ;
// //         for (var entry : hm.entrySet()) {
// //             int key =entry.getKey();//1
// //             int value = entry.getValue();//2;
// //     if(value==1)
// //     {
// //         if(hm2.get(key)!=null &&hm2.get(key)>=1){
// //           arr[z]=key; 
// //             z++;
// //         }
// //     }
// //             if(value>1){
            
// //         if(hm2.get(key)!=null &&hm2.get(key)>=1){
// //           arr[z]=key;  
// //             z++;
// //             if(hm2.get(key)>1){
// //                 int count =hm2.get(key);
// //                 for(int i = 0 ; i<count-1;i++){
// //                   arr[z]=key;  
// //                     z++;  
                    
// //                 }
                
// //             }
// //         }    
        
// //     }
            
// // }
// //         int[] newarr= new int[z];
// //         for(int i = 0 ; i<z;i++){
// //             newarr[i]=arr[i];
// //         }
       
// //    System.out.println(Arrays.toString(arr));
//  Set<T> set = new LinkedHashSet<>();
  
//         // Add the elements to set
//         set.addAll(result);
  
//         // Clear the list
//         result.clear();
  
//         // add the elements of set
//         // with no duplicates to the list
//         result.addAll(set);
    
//     int[] ret = new int[result.size()];
//     for (int i=0; i < ret.length; i++)
//     {
//         ret[i] = result.get(i).intValue();
//     }
//    return ret;
    
    
     Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ansList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] == nums2[j])
            {
                ansList.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
        }
        int ans[] = new int[ansList.size()];
        for(i = 0; i < ansList.size(); i++)
        {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
    
    
    }