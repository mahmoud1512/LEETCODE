class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n=nums.length;

        for (int i = 0; i <n ; i++) {
            if(nums[i]==0)
                continue;
            int x=nums[i]-1;
            while (nums[x]!=0)
            {
                int y=nums[x];
                nums[x]=0;
                if(y==0)
                 break;
                x=y-1;
                
            }
            
        }
        List<Integer> solution=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(nums[i]!=0)
                solution.add(i+1);
        }
        return solution;
    }
}