class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer>set1=new HashSet<>();
            Set<Integer>set2=new HashSet<>();
        for (int x:nums1) {
            set1.add(x);
        }
        List<Integer>l2=new ArrayList<>();
        for (int y:nums2) {
            if(!(set1.contains(y)))
            {
               if(!(set2.contains(y))) 
                l2.add(y);
            }
            set2.add(y);
        }
        List<Integer>l1=new ArrayList<>();
        for (int y:set1) {
            if(!(set2.contains(y)))
            {
                    l1.add(y);
            }
        }
        List<List<Integer>>l=new ArrayList<>();
        l.add(l1);l.add(l2);
        return l;
    }
}