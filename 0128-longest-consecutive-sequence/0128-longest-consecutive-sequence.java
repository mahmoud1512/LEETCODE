
//expand around a number
class Solution {

    Set<Integer>set=new HashSet<>();
    int mx=0;
    public int longestConsecutive(int[] nums) {
        for (int x:nums)
        {
            set.add(x);
        }
        for (int x:nums) {
            if(!set.contains(x))
                continue;
            int l=1;
            int v1=x-1;
            int v2=x+1;
            while (set.contains(v1))
            {
                set.remove(v1);
                l++;
                v1--;
            }
            while (set.contains(v2))
            {
                set.remove(v2);
                l++;
                v2++;
            }
            mx=Math.max(mx,l);
        }
        return mx;
    }
}