// map one by one if found x before with different mapping return false else true
// O(n) time and memory

//import java.util.HashMap;
//import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int size=s.length();
        if(size!=t.length())
            return false;
        Map<Character,Character>isomorphicStrings=new HashMap<>();
        Set<Character>targets=new HashSet<>();
        for (int i = 0; i < size; i++) {
            if(isomorphicStrings.containsKey(s.charAt(i))&&isomorphicStrings.get(s.charAt(i))!=t.charAt(i))
            {
                return false;
            }
            else if(!isomorphicStrings.containsKey(s.charAt(i)))
            {
                if(targets.contains(t.charAt(i)))
                    return false;
                isomorphicStrings.put(s.charAt(i),t.charAt(i));
                targets.add(t.charAt(i));
            }
        }
        return true;
    }
}