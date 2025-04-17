class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]>ans=new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));
        int length=intervals.length;
        int j;
        for (int i = 0; i < length; i++) {
            int x1=intervals[i][0],x2=intervals[i][1];
            j=i+1;
            int end=x2;
            while (j<length)
            {
                if(intervals[j][0]>=x1&&intervals[j][0]<=end)
                {
                    end=Math.max(end,intervals[j][1]);
                    j++;
                }
                else 
                    break;
            }
            ans.add(new int[]{x1,end});
            i=j-1;
        }
        int siz= ans.size();
        int[][]ansArray=new int[siz][2];
        for (int i = 0; i < siz; i++) {
            ansArray[i]=ans.get(i);
        }
        return ansArray;
    }
}