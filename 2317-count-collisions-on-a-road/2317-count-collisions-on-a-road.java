class Solution {
    public int countCollisions(String directions) {
         int collisions=0;
         int len=directions.length();
         Stack<Character>cars=new Stack<>();
        for (int i = 0; i < len; i++) {
            if(!cars.isEmpty()&&cars.peek()=='R'&&directions.charAt(i)=='L')
            {
                collisions+=2;
                cars.pop();
                cars.push('S');
            } else if (!cars.isEmpty()&&cars.peek()=='S'&&directions.charAt(i)=='L') {
                collisions+=1;
            } else if (!cars.isEmpty()&&cars.peek()=='R'&&directions.charAt(i)=='S') {
                collisions+=1;
                cars.pop();
                cars.push('S');
            }
            else 
                cars.push(directions.charAt(i));
        }
        return collisions;
    }
}