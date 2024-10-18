class Solution {

    public int majorityElement(int[] nums) {
        return majority(nums,0,nums.length-1)[1];
    }

    private int[] majority(int[] nums, int start, int end) {

        //base case
        if(start==end)
        {
            return new int[]{1,nums[start]};
        }
         int mid=(start+end)/2;
        int[]x1=majority(nums,start,mid);
        int[]x2=majority(nums,mid +1,end);

        if(x1[1]!=x2[1]){
            if(x1[0]>x2[0])
                return new int[]{x1[0]-x2[0],x1[1]};
            else if (x1[0]<x2[0]) {
                return new int[]{x2[0]-x1[0],x2[1]};
            }
            else
            {
                //They will delete each other
                return new int[]{0,x1[1]};
            }
        }
        else 
            return new int[]{x1[0]+x2[0],x2[1]};
       
    }
}