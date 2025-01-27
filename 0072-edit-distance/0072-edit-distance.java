class Solution {
    int n, m;
    int[][] DP;

    public int minDistance(String word1, String word2) {

        n = word1.length();
        m = word2.length();
        DP = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(DP[i], -1);
        }
        return solve(word1, 0, word2, 0);
    }

    private int solve(String word1, int i, String word2, int j) {

        if (j == m) {
            return (n - i);
        } else if (i == n) {
            return (m - j);
        }
        if (DP[i][j] != -1) {
            return DP[i][j];
        } else {
            if (word1.charAt(i) == word2.charAt(j)) {
                DP[i][j] = solve(word1, i + 1, word2, j + 1);

            }
            else {
                DP[i][j] = Math.min(1 + solve(word1, i + 1, word2, j), Math.min(1 + solve(word1, i, word2, j + 1), 1 + solve(word1, i + 1, word2, j + 1)));
            }
            return DP[i][j];

        }


    }
}