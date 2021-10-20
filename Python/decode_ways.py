class Solution:
    def numDecodings(self, s: str) -> int:
        cache = {}
        
        def helper(ss):
            if (ss in cache):
                return cache[ss]
            
            if len(ss) == 0:
                return 1
            
            ans = 0
            if 1 <= int(ss[0]) <= 9:
                ans += helper(ss[1:])

            if len(ss) > 1 and 10 <= int(ss[0] + ss[1]) <= 26:
                ans += helper(ss[2:])
        
            cache[ss] = ans
            return ans
        
        return helper(s)