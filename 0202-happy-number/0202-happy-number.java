class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        if(n <0) return false;
        while(fast !=1)
        {
            slow = genNext(slow);
            fast = genNext(genNext(fast));
            if(slow==fast&&fast!=1)  // if both reached 1 
            {
                return false;
            }
        }
        return true;
    }

        private static int genNext(int number){
            int sum=0;
            while(number>0){
                int digit = number % 10;
                sum +=  digit * digit;
                number /=10;
            }
            return sum;
        }
    }
