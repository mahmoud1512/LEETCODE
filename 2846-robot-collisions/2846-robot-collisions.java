class node
  {
      int position;
      int health;
      char direction;

      public node(int position,int health, char direction) {
          this.position=position;
          this.health = health;
          this.direction = direction;
      }
  }
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Map<Integer,int[]>map=new HashMap<>();
        Map<Integer,Integer>Ordinal=new HashMap<>();
        int size= positions.length;
        int[]temp=new int[size];
        for (int i = 0; i < size; i++) {
            map.put(positions[i],new int[]{healths[i],directions.charAt(i)});
            Ordinal.put(positions[i],i );
        }
        Arrays.sort(positions);
        Stack<node>stack=new Stack<>();
        for (int x:positions) {
            int[]data= map.get(x);
            temp[Ordinal.get(x)]=data[0];
            while(!(stack.isEmpty())&&(char) data[1]=='L'&&stack.peek().direction=='R')
            {
                node data2=stack.pop();

                if(data2.health>data[0])
                {
                    int v=data2.health-1;
                    stack.push(new node(data2.position,v,data2.direction));
                    temp[Ordinal.get(data2.position)]=v;
                    temp[Ordinal.get(x)]=0;
                    data[0]=0;

                }
                else if (data[0]>data2.health) {
                    //stack.push(new node(x,data[0]-1,(char) data[1]));
                    temp[Ordinal.get(x)]=data[0]-1;
                    data[0]--;
                    temp[Ordinal.get(data2.position)]=0;
                }
                else
                {
                    temp[Ordinal.get(data2.position)]=0;
                    temp[Ordinal.get(x)]=0;
                    data[0]=0;
                }
                if (data[0]==0)
                    break;
            }
            int h=temp[Ordinal.get(x)];
            if(h!=0)
            {
                    stack.push(new node(x,h,(char) data[1]));
            }

        }

        List<Integer>ans=new ArrayList<>();
        for (int n:temp) {
            if(n!=0)
            {
                ans.add(n);
            }
        }
        return ans;
    }
}