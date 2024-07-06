class Solution {
      Set<List<Integer>>ans=new HashSet<>();
      Set<Integer>cont=new HashSet<>();
      Map<Integer,Integer>MapCount=new HashMap<>();
    public List<List<Integer>> threeSum(int[] nums) {
        for (int x:nums) {
            cont.add(x);
            if(!MapCount.containsKey(x))
            {
                MapCount.put(x,1);
            }
            else
            {
                MapCount.put(x,MapCount.get(x)+1);
            }
        }
        for (int x:cont) {
            for (int y:cont) {
                int find=0-(x+y);
                if(cont.contains(find))
                {
                    Map<Integer,Integer>MapCheck=new HashMap<>();
                    if(!MapCheck.containsKey(x))
                    {
                        MapCheck.put(x,1);
                    }
                    else
                    {
                        MapCheck.put(x,MapCheck.get(x)+1);
                    }
                    if(!MapCheck.containsKey(y))
                    {
                        MapCheck.put(y,1);
                    }
                    else
                    {
                        MapCheck.put(y,MapCheck.get(y)+1);
                    }
                    if(!MapCheck.containsKey(find))
                    {
                        MapCheck.put(find,1);
                    }
                    else
                    {
                        MapCheck.put(find,MapCheck.get(find)+1);
                    }
                    if((MapCount.get(x)>=MapCheck.get(x))&&(MapCount.get(y)>=MapCount.get(y))&&(MapCount.get(find)>=MapCheck.get(find)))
                    {
                        List<Integer>add=new ArrayList<>(Arrays.asList(x,y,find));
                        Collections.sort(add);
                        ans.add(add);
                    }
                }
            }
        }
        List<List<Integer>>ANS=new ArrayList<>();
        for (List<Integer>x:ans) {
            ANS.add(x);
        }
        return ANS;
    }
}