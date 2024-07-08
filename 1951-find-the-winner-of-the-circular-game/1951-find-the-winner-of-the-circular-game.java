class Solution {
    public int findTheWinner(int n, int k) {
           LinkedList<Integer>list=new LinkedList<>();
        for (int i = 1; i <=n ; i++) {
          list.add(i);
        }
        int now=1;
        while (list.size()!=1)
        {
            for (int i = now; i < now+k-1; i++) {
                int x= list.poll();
                list.add(x);
            }
            int leave=list.poll();
            now=list.get(0);
        }
        return list.get(0);

    }
}