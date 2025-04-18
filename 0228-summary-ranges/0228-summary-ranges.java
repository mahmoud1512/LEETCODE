class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>ans=new ArrayList<>();
        int len=nums.length;
        for (int i = 0; i < len; i++) {
            int st=nums[i],end=nums[i];
            int temp=i,j=i+1;
            while (j<len&&nums[j]-nums[temp]==1)
            {
                end=nums[j];
                temp++;
                j++;
            }
            if(st!=end)
            {
                ans.add(st +"->"+ end);
            }
            else 
                ans.add(Integer.toString(st));
            
            i=temp;
        }
        return ans;
    }
}