
class Solution {
    public String reverseVowels(String s) {
        char[]str=s.toCharArray();
        int siz=s.length();
        ArrayList<Integer>vowels=new ArrayList<>();
        for (int i = 0; i < siz; i++) {
            if(isVowel(str[i]))
            {
                vowels.add(i);
            }
        }
        int left=0,right=vowels.size()-1;
        while(left<right)
        {
            char temp=str[vowels.get(left)];
            str[vowels.get(left)]=str[vowels.get(right)];
            str[vowels.get(right)]=temp;
            left++;right--;
        }
        return new String(str);
       
    }
    boolean isVowel(char x)
    {
        return x=='a'||x=='e'||x=='o'||x=='u'||x=='i'||x=='A'||x=='E'||x=='O'||x=='U'||x=='I';
    }
}