class Solution {
    public int countSeniors(String[] details) {
        int siz=details.length;int cnt=0;
        for (int i = 0; i < siz; i++) {
            int age=Integer.parseInt(details[i].substring(11,13));
            if(age>60)
                cnt++;
        }
       return cnt;
    }
}