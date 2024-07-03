class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0)
              return new long[]{};
        long v=num/3;
        return new long[]{v-1,v,v+1};      
    }
}