class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<List<Integer>,List<String>>AnagramGrouper=new HashMap<>();
        for (String x:strs) {
            List<Integer> stringDecomposition =getDecomposition(x);
            if(AnagramGrouper.containsKey(stringDecomposition))
            {
                AnagramGrouper.get(stringDecomposition).add(x);
            }
            else
            {
                List<String>anagram=new ArrayList<>();
                anagram.add(x);
                AnagramGrouper.put(stringDecomposition,anagram);
            }
        }
        List<List<String>>ans=new ArrayList<>();
        for (List<Integer> x:AnagramGrouper.keySet()) {
            ans.add(AnagramGrouper.get(x));
        }
        return ans;
    }

    private List<Integer> getDecomposition(String x) {
        List<Integer>decomposition=new ArrayList<>(26);
        int siz=x.length();
        for (int i = 0; i < 26; i++) {
            decomposition.add(0);
        }

        int index;
        for (int i = 0; i < siz; i++) {
            index=x.charAt(i)-'a';
            decomposition.set(index, decomposition.get(index) + 1);
        }
        return decomposition;
    }
}