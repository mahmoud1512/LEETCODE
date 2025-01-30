class activity
{
    int startTime;
    int finishTime;
    int weight;
}


class Solution {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int length=profit.length;
        activity[]activities=new activity[length];
        for (int i = 0; i < length; i++) {
            activities[i]=new activity();
            activities[i].startTime=startTime[i];
            activities[i].finishTime=endTime[i];
            activities[i].weight=profit[i];
        }
        Arrays.sort(activities, Comparator.comparingInt(e -> e.finishTime));

        for (int i = 0; i < length; i++) {

            int l=i;
            int prevCompatible=BinarySearch(l,activities);

            if (prevCompatible!=-1)
            {
                activities[i].weight+=activities[prevCompatible].weight;
            }
            if (i>0)
             activities[i].weight=Math.max(activities[i].weight,activities[i-1].weight); //leave myself

        }
        return activities[length-1].weight;

    }

    private int BinarySearch(int end,activity[]activities) {

        int l=0,r=end-1;
        int ans=-1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if(activities[mid].finishTime<=activities[end].startTime)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return ans;
    }
}