class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        char_index = {}  # To store the index of each character in the current substring
        max_length = 0
        start = 0  # Start of the current substring

        for end in range(len(s)):
            # If the character is already in the current substring, update the start position
            if s[end] in char_index and char_index[s[end]] >= start:
                start = char_index[s[end]] + 1

            # Update the index of the current character
            char_index[s[end]] = end

            # Update the maximum length if needed
            max_length = max(max_length, end - start + 1)

        return max_length
