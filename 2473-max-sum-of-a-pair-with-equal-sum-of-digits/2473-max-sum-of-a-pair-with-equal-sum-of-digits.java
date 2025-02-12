class digitsSummer
{
    int number;
    int sum;

    public digitsSummer(int number, int counter) {
        this.number = number;
        this.sum = counter;
    }
}
class Solution {
    public int maximumSum(int[] nums) {
        int len = nums.length;
        digitsSummer[] counters = new digitsSummer[len+1];
        for (int i = 0; i < len; i++) {
            counters[i] = new digitsSummer(nums[i], getDigitSum(nums[i]));
        }
        counters[len]=new digitsSummer(0, 1000); //dummy
        Arrays.sort(counters, Comparator
                .comparingInt((digitsSummer e) -> e.sum) // Compare by 'sum' field
                .thenComparingInt(e -> e.number) // Then compare by 'number' field
        );

        int c=counters[0].sum;
        int max=Integer.MIN_VALUE;
        for (int i = 1; i < len+1; i++) {
            if(counters[i].sum !=c)
            {
                if(i-2>=0&&counters[i-2].sum==counters[i-1].sum)
                {
                    max=Math.max(max,counters[i-2].number+counters[i-1].number);
                }
                c=counters[i].number;
            }
        }
        return Math.max(max,-1);

    }

    private int getDigitSum(int num) {
        int sum=0;
        while (num!=0)
        {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}