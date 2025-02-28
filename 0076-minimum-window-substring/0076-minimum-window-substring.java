

class Solution {
    private int[] countT;
    private List<Character> requiredChars;

    public String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) return "";

        // Initialize countT and requiredChars
        countT = new int[128];
        requiredChars = new ArrayList<>();
        for (char c : t.toCharArray()) {
            countT[c]++;
        }
        for (int i = 0; i < 128; i++) {
            if (countT[i] > 0) {
                requiredChars.add((char) i);
            }
        }

        int lenS = s.length();
        String minWindow = "."; // Placeholder for an invalid window
        int left = 0;
        int[] countS = new int[128];

        for (int right = 0; right < lenS; right++) {
            char currentChar = s.charAt(right);
            countS[currentChar]++;

            // Try to shrink the window as much as possible while maintaining the condition
            while (left <= right && satisfiesCondition(countS)) {
                int currentWindowLength = right - left + 1;
                if (minWindow.equals(".") || currentWindowLength < minWindow.length()) {
                    minWindow = s.substring(left, right + 1);
                }
                // Move the left pointer to shrink the window
                char leftChar = s.charAt(left);
                countS[leftChar]--;
                left++;
            }
        }

        return minWindow.equals(".") ? "" : minWindow;
    }

    private boolean satisfiesCondition(int[] countS) {
        for (char c : requiredChars) {
            if (countS[c] < countT[c]) {
                return false;
            }
        }
        return true;
    }
}