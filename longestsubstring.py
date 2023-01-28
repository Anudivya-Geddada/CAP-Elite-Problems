#Longest Substring without repeating characters

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if(len(s)==0):
            return 0
        dict1 = {}
        max_len = 0
        start = 0
        for i in range(len(s)):
            if(s[i] in dict1) and (start<=dict1[s[i]]):
                start = dict1[s[i]]+1
            else:
                max_len = max(max_len,i-start+1)
            dict1[s[i]]=i
        return(max_len)
