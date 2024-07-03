class Solution {
    char[][]my_board;
    public boolean isValidSudoku(char[][] board) {
            my_board=board;
            return rows()&&cols()&&boxes();
    }
    boolean rows()
    {
        for (int i = 0; i < 9; i++) {
            Set<Character>set=new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (my_board[i][j]=='.')
                    continue;
                if(set.contains(my_board[i][j]))
                    return false;
                set.add(my_board[i][j]);
            }
        }
        return true;
    }
    boolean cols()
    {
        for (int i = 0; i < 9; i++) {
            Set<Character>set=new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (my_board[j][i]=='.')
                    continue;
                if(set.contains(my_board[j][i]))
                    return false;
                set.add(my_board[j][i]);
            }
        }
        return true;
    }
    boolean boxes()
    {
          boolean ans1=true,ans2=true,ans3=true;
        for (int i = 0; i <=6 ; i+=3) {
            ans1=ans1&check_box(0,3,i,i+3);
            if(ans1==false)
                return false;
        }
        for (int i = 0; i <=6 ; i+=3) {
            ans2=ans2&check_box(3,6,i,i+3);
            if(ans2==false)
                return false;
        }
        for (int i = 0; i <=6 ; i+=3) {
             ans3 = ans3 & check_box(6, 9, i, i + 3);
            if(ans3==false)
                return false;
        }
        return true;

    }
    boolean check_box(int r1,int r2,int c1,int c2)
    {
        Set<Character>set=new HashSet<>();
        for (int i = r1; i < r2; i++) {
            for (int j = c1; j < c2; j++) {
                if (my_board[i][j]=='.')
                    continue;
                if(set.contains(my_board[i][j]))
                    return false;
                set.add(my_board[i][j]);
            }
        }
        return true;
    }
}