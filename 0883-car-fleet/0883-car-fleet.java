class Solution {
    Map<Integer,Integer>map=new HashMap<>();
    int fast;
    public int carFleet(int target, int[] position, int[] speed) {
        //Position-Speed pairs
        int size= position.length;
        for (int i = 0; i < size; i++) {
            map.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        //System.out.println(List.of(position));
        //int l=size-1;
        Stack<Integer>stack=new Stack<>();

        for (int x:position) {
            fast=map.get(x);
            while(!(stack.isEmpty())&&canSubstitute(x,stack.peek(),target))
            {
                int c=stack.pop();   
            }
            stack.push(x);
            map.put(x,fast);
        }

        return stack.size();
    }
    boolean canSubstitute(int x,int y,int target)
    {
        return (long)(target-x)*map.get(y)>=(long)(target-y)*fast;
    }
}