class Solution {
    public int maximumGain(String s, int x, int y) {
        int siz=s.length();
        int ans=0;
          if(x>y)
          {
              Stack<Character>st=new Stack<>();
              for (int i = 0; i < siz; i++) {
                  char op=s.charAt(i);
                  if(op=='b'&&(!st.isEmpty())&&st.peek()=='a')
                  {
                      st.pop();
                      ans+=x;
                  }
                  else
                      st.push(op);
              }
              Stack<Character>secondPass=new Stack<>();
             while (!(st.isEmpty()))
             {
                 char v=st.pop();
                 if(v=='b'&&(!secondPass.isEmpty())&&secondPass.peek()=='a')
                 {
                     secondPass.pop();
                     ans+=y;
                 }
                 else
                     secondPass.push(v);
             }
               return  ans;
          }
          else
          {
              Stack<Character>st=new Stack<>();
              for (int i = 0; i < siz; i++) {
                  char op=s.charAt(i);
                  if(op=='a'&&(!st.isEmpty())&&st.peek()=='b')
                  {
                      st.pop();
                      ans+=y;
                  }
                  else
                      st.push(op);
              }
              Stack<Character>secondPass=new Stack<>();
              while (!(st.isEmpty()))
              {
                  char v=st.pop();
                  if(v=='a'&&(!secondPass.isEmpty())&&secondPass.peek()=='b')
                  {
                      secondPass.pop();
                      ans+=x;
                  }
                  else
                      secondPass.push(v);
              }
                return ans;

          }
    }
}