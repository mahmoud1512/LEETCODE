class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int magazineSize=magazine.length();
        int[]arr=new int[26];
        for (int i = 0; i < magazineSize; i++) {
            arr[magazine.charAt(i)-'a']++;
        }
        int ransomSize=ransomNote.length();
        for (int i = 0; i < ransomSize; i++) {
            if(arr[ransomNote.charAt(i)-'a']==0)
                return false;
            arr[ransomNote.charAt(i)-'a']--;
        }
        return true;

    }
}