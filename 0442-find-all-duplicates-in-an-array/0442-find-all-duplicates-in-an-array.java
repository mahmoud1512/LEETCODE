class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i]==0)
                continue;

            int x=nums[i]-1;

            if(nums[x]==0)
            {
                answer.add(x+1);
                continue;
            }

            while (nums[x]!=0)
            {
                 int y=nums[x]-1;
                 nums[x]=0;

                 if(nums[y]==0&&x>i) {
                     answer.add(y + 1);
                     //break;
                 }
                 x=y;
            }

        }
        return answer;

    }
}