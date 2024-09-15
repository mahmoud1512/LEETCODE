class Solution {
    public int[][] kClosest(int[][] points, int k) {
          PriorityQueue<int[]>priorityQueue=new PriorityQueue<>(new ArrayComparator());
          for (int[] x:points)
          {
              priorityQueue.add(x);
          }
          int[][]ans=new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i]=priorityQueue.poll();
        }
        return ans;
    }
}
class ArrayComparator implements Comparator<int[]>
{

    @Override
    public int compare(int[] o1, int[] o2) {
        return (o1[0]*o1[0]+o1[1]*o1[1])-(o2[0]*o2[0]+o2[1]*o2[1]);
    }
}