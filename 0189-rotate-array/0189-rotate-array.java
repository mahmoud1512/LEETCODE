class Solution {
    public void rotate(int[] nums, int k) {
        
          int len=nums.length;
          k=k%len;
          reverse(nums,0,len-1);
          reverse(nums,0,k-1);
          reverse(nums,k,len-1);

    }

    void reverse(int[]arr,int l,int r)
    {
        int temp;
        while(l<=r)
        {
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}