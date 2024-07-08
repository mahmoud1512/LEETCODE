class Solution {
    public String getEncryptedString(String s, int k) {
        int siz=s.length();
           char[]arr=new char[siz];
        for (int i = 0; i < siz; i++) {
            arr[i]=s.charAt((i+k)%siz);
        }
        return new String(arr);
    }
}