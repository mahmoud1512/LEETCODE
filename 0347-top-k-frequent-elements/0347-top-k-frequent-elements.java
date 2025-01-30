class Solution {


    public int[] topKFrequent(int[] nums, int k) {
         int[]answer=new int[k];
         k=k-1;
         int length=nums.length;
         Map<Integer,Integer>frequencyCounter=new HashMap<>();
         ArrayList<LinkedList<Integer>> reverseCountSort=new ArrayList<>(length+1);
         for (int i = 0; i < length+1; i++) {
            reverseCountSort.add(new LinkedList<>());
        }


        for (int num:nums) {
            if(frequencyCounter.containsKey(num))
            {
                frequencyCounter.put(num, frequencyCounter.get(num)+1);
            }
            else
            {
                frequencyCounter.put(num,1);
            }
        }

        for (int key:frequencyCounter.keySet()) {

            reverseCountSort.get(frequencyCounter.get(key)).add(key);
        }
        for (int i = length; i >=0 ; i--) {
           
            for (int val:reverseCountSort.get(i)) {
                answer[k--]=val;
                if(k==-1)
                    return answer;
            }

        }
        return null;
    }
}