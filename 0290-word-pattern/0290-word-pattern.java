class Solution {
    public boolean wordPattern(String pattern, String s) {
          String[]tokens=s.split(" ");
          int size=pattern.length();
          if(size!=tokens.length)
              return false;
          Map<String,Character> patternMap=new HashMap<>();
          Set<Character>targets=new HashSet<>();
        for (int i = 0; i < size; i++) {
            if(patternMap.containsKey(tokens[i])&&patternMap.get(tokens[i])!=pattern.charAt(i))
            {
                return false;
            }
            else if(!patternMap.containsKey(tokens[i]))
            {
                if(targets.contains(pattern.charAt(i)))
                    return false;
                patternMap.put(tokens[i],pattern.charAt(i));
                targets.add(pattern.charAt(i));
            }
                
        }
        return true;
    }
}