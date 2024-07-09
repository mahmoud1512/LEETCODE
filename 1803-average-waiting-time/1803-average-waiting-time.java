class Solution {
    public double averageWaitingTime(int[][] customers) {
           long time=(long)customers[0][0];long waiting=0;
        for (int []arr:customers) {
            if(arr[0]>time)
                time=arr[0];
            time=time+arr[1];
           // System.out.println(time);
            waiting+=time-arr[0];
        }
        double ans=(double)waiting/customers.length;
        return ans;
    }
}