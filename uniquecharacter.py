#First Unique Characters in a String
class Solution:
    def firstUniqChar(self, s: str) -> int:
        l1=list(s)
        for i in range(len(l1)):
            if s.count(l1[i])==1:
                return i
        return -1
