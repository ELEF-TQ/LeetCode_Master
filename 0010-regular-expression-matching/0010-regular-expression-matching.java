class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // Create a DP table to store the matching results
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Base case: empty pattern matches empty string
        dp[0][0] = true;
        
        // Fill in the first row (pattern) of the DP table
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                // '*' can match zero preceding element
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        // Fill in the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    // If current characters match, or pattern is '.'
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    // '*' can match zero or more of the preceding element
                    dp[i][j] = dp[i][j - 2]; // Zero preceding element
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        // If '*' matches one or more of the preceding element
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }
        
        // Return the result for the entire string
        return dp[m][n];
    }
}
