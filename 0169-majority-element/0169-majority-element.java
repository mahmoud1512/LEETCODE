//this problem can be solved by sort and one pass O(nlg)
//or by one pass using a helper variable candidate O(n)
class Solution {

    public int majorityElement(int[] nums) {
          int size=nums.length;
          int Candidate=nums[0];
          int counter=1;
          int i=1;
          boolean p=true;
         while (i<size)
         {
             if (nums[i]==Candidate) {
                 if(p)
                     counter++;
                 else 
                     counter--;
             }
             else{
                 if(p){
                     counter--;
                     if(counter<0) {
                         Candidate = nums[i];
                         p=false;
                     }
                 }
                 else
                 {
                     counter++;
                     if(counter>0) {
                         Candidate = nums[i];
                         p=true;
                     }
                 }
                
             }
             i++;
         }
         return Candidate;
    }
}