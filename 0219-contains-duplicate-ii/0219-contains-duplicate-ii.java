class Solution {
    Map<Integer,PriorityQueue<Integer>>map=new HashMap<>();
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int siz= nums.length;
        for (int i = 0; i < siz; i++) {
            if(map.containsKey(nums[i]))
            {
                int top=map.get(nums[i]).peek();
                if(i-top<=k)
                    return true;
                map.get(nums[i]).add(i);
            }
            else
            {
                PriorityQueue<Integer>x=new PriorityQueue<>(Comparator.reverseOrder());
                x.add(i);
                map.put(nums[i],x);
            }
        }
        return false;
    }

}