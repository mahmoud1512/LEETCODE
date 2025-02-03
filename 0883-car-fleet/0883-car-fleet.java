class car
{
    int position;
    int speed;
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len=position.length;
        car[]cars=new car[len];
        for (int i = 0; i < len; i++) {
              car c=new car();
              c.position=position[i];
              c.speed=speed[i];
              cars[i]=c;
        }
        Arrays.sort(cars, Comparator.comparingInt(e -> e.position));
        Stack<Double>timeStack=new Stack<>();
        for (int i = len-1; i >=0 ; i--) {
            double time=(target-cars[i].position)/(double)cars[i].speed;
            while (!timeStack.isEmpty()&&timeStack.peek()>=time){
                time=timeStack.pop();
            }
            timeStack.push(time);
        }
        return timeStack.size();
    }
}
