class TimeMap {

    Map<String,Lists>map;
    public TimeMap() {
         map=new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Lists lists;
        if(map.containsKey(key))
            {
                lists = map.get(key);
                lists.stamps.add(timestamp);
                lists.values.add(value);
            }
            else
            {
                lists = new Lists();
                lists.values.add(value);
                lists.stamps.add(timestamp);
            }
        map.put(key,lists);
    }

    public String get(String key, int timestamp) {
           if (!map.containsKey(key))
               return "";
           else
           {
               Lists lists= map.get(key);
               int siz=lists.stamps.size();
               String ans="";
               int l= 0,r=siz-1;
               while (l<=r)
               {
                   int m=(l+r)/2;
                   int val=lists.stamps.get(m);
                   if(val<=timestamp)
                   {
                       ans=lists.values.get(m);
                       l=m+1;
                   }
                   else if (val>timestamp)
                   {
                       r=m-1;
                   }
               }
               return ans;

           }
    }
}
class Lists
{
    List<String>values=new ArrayList<>();
    List<Integer>stamps=new ArrayList<>();

}
