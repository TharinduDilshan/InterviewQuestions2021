class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int loc=0,glo=INT_MIN;
        
        for(int i:nums)
        {
            loc+=i;
            glo = max(glo,loc) ;
            loc = max(loc,0) ;
        }
        
        return glo ;
    }
};