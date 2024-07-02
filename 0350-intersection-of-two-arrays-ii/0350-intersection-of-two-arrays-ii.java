class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
          int[]count1=new int[1001];
          int[]count2=new int[1001];
          int siz1=nums1.length,siz2=nums2.length;
        for (int j : nums1) {
            count1[j]++;
        }
        for (int x:nums2) {
            count2[x]++;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i = 0; i <=1000; i++) {
            int freq=Math.min(count1[i],count2[i]);
            while(freq>0)
            {
               ans.add(i);
               freq--;
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}