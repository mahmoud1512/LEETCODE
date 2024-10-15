class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>aster=new Stack<>();
        boolean pos=false;
        for (int x:asteroids) {
            if(x>=0)
            {
                aster.push(x);
                pos=true;
            }
            else if(!pos)
            {
                aster.push(x);
            }
            else 
            {
                while(!aster.isEmpty()&&aster.peek()>=0&&Math.abs(aster.peek())<Math.abs(x))
                {
                    aster.pop();
                }
                if(!aster.isEmpty()&&aster.peek()>=0&&Math.abs(aster.peek())>Math.abs(x))
                    continue;
                else if(!aster.isEmpty()&&aster.peek()>=0&&Math.abs(aster.peek())==Math.abs(x))
                    aster.pop();
                else {
                    aster.push(x);
                    pos=false;
                }

            }

        }
        int siz=aster.size();
        int[]ans=new int[siz];
        int index=siz-1;
        while (index>=0)
        {
            ans[index]=aster.pop();
            index--;
        }
        return ans;
    }
}