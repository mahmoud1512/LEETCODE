class Solution {
    public String frequencySort(String s) {
        int size=s.length();
        Map<Character,Integer>characterFrequencyMap=new HashMap<>();
        for (int i = 0; i < size; i++) {
            if(!characterFrequencyMap.containsKey(s.charAt(i)))
                characterFrequencyMap.put(s.charAt(i),1);
            else
                characterFrequencyMap.put(s.charAt(i),characterFrequencyMap.get(s.charAt(i))+1);
        }
        List<Map.Entry<Character,Integer>>maptoList=new ArrayList<>(characterFrequencyMap.entrySet());
        maptoList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        StringBuilder ans= new StringBuilder();
        for (Map.Entry<Character,Integer>x:maptoList) {
            int val=x.getValue();
            while (val!=0)
            {
                ans.append(x.getKey());
                val--;
            }
        }
        return ans.toString();

    }
}