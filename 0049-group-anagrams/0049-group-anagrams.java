class Solution {
    Map<List<Integer>,List<String>>map=new HashMap<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        int siz=strs.length;
        for (int i = 0; i <siz ; i++) {
            List<Integer>list=decompose(strs[i]);
              if(map.containsKey(list))
              {
                  map.get(list).add(strs[i]);
              }
              else
              {
                  map.put(list,new ArrayList<>(Arrays.asList(strs[i])));
              }
        }
        List<List<String>>ans=new ArrayList<>();
        for (List<Integer>entry:map.keySet()) {
            ans.add(map.get(entry));
        }
        return ans;
    }
    List<Integer> decompose(String x)
    {
       int []arr=new int[26];
       List<Integer>ans=new ArrayList<>();
        int l=x.length();
        for (int i = 0; i < l; i++) {
            arr[x.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            ans.add(arr[i]);
        }
     return ans;
        
    }
}