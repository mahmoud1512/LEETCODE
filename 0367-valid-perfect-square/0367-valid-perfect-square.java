class Solution {
    public boolean isPerfectSquare(int num) {
           int l=1,r=num/2+1;  //to handle odd numbers i add 1
           while (l<=r)
           {
               int m=l+(r-l)/2;
               long val=(long)m*m;
               if(val==num)
                   return true;
               else if(val<num)
               {
                   l=m+1;
               }
               else 
                   r=m-1;
           }
           return false;
    }
}
