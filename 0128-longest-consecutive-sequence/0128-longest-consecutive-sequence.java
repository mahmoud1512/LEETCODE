class Solution {
    Map<Integer,Boolean>map=new HashMap<>();
    Set<Integer>set=new HashSet<>();
    int mx=0;
    public int longestConsecutive(int[] nums) {
        for (int x:nums)
        {
            set.add(x);
            map.put(x,false);
        }
        for (int x:set) {
            if (map.get(x))
                continue;
            map.put(x,true);
            int l=1;
            int v1=x-1;
            int v2=x+1;
            while (set.contains(v1))
            {
                map.put(v1,true);
                l++;
                v1--;
            }
            while (set.contains(v2))
            {
                map.put(v2,true);
                l++;
                v2++;
            }
            mx=Math.max(mx,l);
        }
          return mx;
    }
}