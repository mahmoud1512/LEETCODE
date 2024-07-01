class Solution {
    public int removeElement(int[] nums, int val) {
        if(val>50)
          return nums.length;
          int []count=new int[51];
          int siz= nums.length;
        for (int i = 0; i < siz; i++) {
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<51;i++)
        {
            if(i==val)
                continue;
            else
            {
                while(count[i]>0)
                {
                    nums[j++]=i;
                    count[i]--;
                }
            }
        }
        return siz-count[val];
    }
}