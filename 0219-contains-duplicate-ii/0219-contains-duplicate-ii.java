class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          Map<Integer,Integer>valueIndexMap=new HashMap<>();
          int size=nums.length;
        for (int i = 0; i < size; i++) {
            if(valueIndexMap.containsKey(nums[i]))
            {
                if(Math.abs(i-valueIndexMap.get(nums[i]))<=k)
                    return true;
                else 
                    valueIndexMap.put(nums[i],i);
                    
            }
            else
            {
                valueIndexMap.put(nums[i],i);
            }
        }
      
        return false;



    }
}