class Solution {
    public boolean isHappy(int n) {
        Set<Integer>digitsSums=new HashSet<>();
        if(n==1)
            return true;
        digitsSums.add(n);
        int x;
        while (true)
        {
            x=getDigitSum(n);
            if(digitsSums.contains(x))
                return false;
            else if(x==1)
                return true;
            else {
                n = x;
               //x=getDigitSum(n);
                digitsSums.add(x);
            }

        }

    }

    private int getDigitSum(int n) {
        int x=0,u;
        while (n!=0)
        {
            u=n%10;
            x+=u*u;
            n=n/10;
        }
        return x;
    }
}