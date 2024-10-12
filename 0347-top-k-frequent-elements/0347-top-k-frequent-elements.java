class Solution {
      Map<Integer /*data*/, Integer /*Frequency*/> FreQmap=new HashMap<>();
    public int[] topKFrequent(int[] nums, int k) {
          for (int x:nums)
          {
              if(!FreQmap.containsKey(x))
              {
                  FreQmap.put(x,1);
              }
              else
                  FreQmap.put(x,FreQmap.get(x)+1);
          }
          PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>((e1,e2)->e1.getValue().compareTo(e2.getValue()));
          for (Map.Entry<Integer,Integer> x: FreQmap.entrySet())
          {
              if(pq.size()<k)
                  pq.add(x);
              else
              {
                  if(FreQmap.get(pq.peek().getKey())<FreQmap.get(x.getKey()))
                  {
                      pq.poll();
                      pq.add(x);
                  }
              }
          }
          int[]ans=new int[k];
        for (int i = 0; i < k; i++) {
            ans[i]= pq.poll().getKey();
        }
        return ans;
    }
}