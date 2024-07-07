class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int p1=0,p2=0;
            int siz1=nums1.length,siz2=nums2.length;
            Set<Integer>set=new HashSet<>();
            while ((p1<siz1)&&(p2<siz2))
            {
                if(nums1[p1]<nums2[p2])
                    p1++;
                else if (nums1[p1]>nums2[p2]) {
                    p2++;
                }
                else
                {
                    set.add(nums1[p1]);
                    p1++;
                    p2++;
                }
            }
            int []ans=new int[set.size()];
            int j=0;
        for (int x:set) {
            ans[j++]=x;
        }
        return ans;
    }
}