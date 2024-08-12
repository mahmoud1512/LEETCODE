class node
{
   
    Set<String>neighbors=new HashSet<>();
    
}
class Solution {
    Map<String,node>map=new HashMap<>();
    Queue<String>queue=new ArrayDeque<>();
    String end;
    Set<String>visited=new HashSet<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        end=endWord;
        int siz= wordList.size();
        map.put(beginWord,new node());
        for (int i = 0; i < siz; i++) {
            map.put(wordList.get(i),new node());
        }
         //lets make graph
        for (String v: map.keySet()) {
            String s=v;
            int len=s.length();
            char[]arr=s.toCharArray();
            for (int j = 0; j < len; j++) {
                int curr=arr[j]-'a';
                for (int k = 0; k < 26; k++) {
                    if(curr==k)
                        continue;
                    arr[j]= (char) ('a'+k);
                    String temp=new String(arr);
                    if(map.containsKey(temp))
                    {
                        node x=map.get(s);
                        x.neighbors.add(temp);
                    }
                }
                arr[j]= (char) ('a'+curr);
            }
        }
        queue.add(beginWord);
        visited.add(beginWord);
        return bfs();
    }
    int bfs()
    {
        int siz= queue.size();
        int depth;
        int dist=0;
        while (!queue.isEmpty())
        {
            depth=0;
            for (int i = 0; i < siz; i++) {
                String s= queue.poll();
                if(s.equals(end))
                    return dist+1;
                node node=map.get(s);
                for (String neighbor: node.neighbors) {
                    if(!visited.contains(neighbor))
                    {
                        visited.add(neighbor);
                        queue.add(neighbor);
                        depth++;
                    }
                }
            }
            siz=depth;
            dist++;
        }
        return 0;
    }
}