class Solution {
    public List<List<Integer>> threeSum(int[] nums) {   //sort and solve it as two sum II
            Arrays.sort(nums);
            List<List<Integer>>ans=new ArrayList<>();
            int p1,p2=0,p3=0;
            int len=nums.length;
            int val;
            int prev=Integer.MAX_VALUE;
        for (p1 = 0; p1 <len-2 ; p1++) {
            val=nums[p1];
            if(val==prev)
                continue;
            else
                prev=val;
            p2=p1+1;p3=len-1;
            if(p2>=p3)
                break;
            else
            {
                int prevP2=Integer.MAX_VALUE;
                boolean move=false;
                while (p2<p3)
                {
                    if(nums[p2]==prevP2&&move)
                    {
                        p2++;
                        continue;
                    }
                    else 
                        prevP2=nums[p2];
                    
                    int x=val+nums[p2]+nums[p3];
                    if(x==0) {
                        ans.add(new ArrayList<>(List.of(val, nums[p2], nums[p3])));
                        p2++;
                        p3--; //try new triplet
                        move=true;
                    }
                    else if (x<0) {
                        p2++;
                        move=true;
                    }
                    else{
                        p3--;
                        move=false;
                    }

                }
            }
        }
        return ans;
    }
}