class Solution {
    public int[] productExceptSelf(int[] nums) {
              int siz= nums.length;
              int []returnedOne=new int[siz];
             returnedOne[siz-1]=nums[siz-1];
        for (int i = siz-2; i >=0; i--) {
            returnedOne[i]=returnedOne[i+1]*nums[i];
        }
        int pro=1;int cnt=0;
        if(nums[0]!=0)
            pro=nums[0];
        else 
            cnt++;
        for (int i = 1; i <siz ; i++) {
            if(nums[i]==0)
            {
                cnt++;
            }
            else 
                pro*=nums[i];
            nums[i]=nums[i-1]*nums[i];
        }
        
        if(cnt>=2)
        {
            return new int[siz];
        }
        else if(cnt==1)
        {
           int val=nums[0];
           if(val==0)
           {
               returnedOne[0]=pro;
               for (int i = 1; i <siz ; i++) {
                   returnedOne[i]=0;
               }
               return returnedOne;
           }
           else
           {
               returnedOne[0]=0;
           }
           int stop = 0;
            for (int i = 1; i < siz; i++) {
                    val=nums[i]/nums[i-1];
               if(val==0)
               {
                   returnedOne[i]=pro;
                   stop=i+1;
                   break;
               }
                   
            }
            for (int i = stop; i <siz ; i++) {
                returnedOne[i]=0;
            }
            
            return returnedOne;
        }
        for (int i = 0; i < siz; i++) {
            int val = 0;
            if(i==0)
            {
                val=nums[i];
            }
            else
                val=nums[i]/nums[i-1];
                long O1=((long)returnedOne[i]*nums[i]);
                long ans=O1/(val*val);
            returnedOne[i]=(int)ans;
        }
        return returnedOne;
    }
}