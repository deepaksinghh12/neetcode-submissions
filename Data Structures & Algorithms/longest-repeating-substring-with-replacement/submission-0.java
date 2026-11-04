class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            freq[s.charAt(right) - 'A']++;

            // Update maximum frequency
            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(right) - 'A']
            );

            // Shrink window if replacements exceed k
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update answer
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }
}