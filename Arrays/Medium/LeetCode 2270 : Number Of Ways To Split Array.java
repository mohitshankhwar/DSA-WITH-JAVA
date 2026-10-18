class Solution {
    public int waysToSplitArray(int[] nums) 
    {
        long totalsum = 0;

        for ( int num : nums)
        {
            totalsum+=num;
        }
        long leftsum = 0;
        int count = 0;
        
        for( int i=0; i<nums.length-1;i++)
        {
            leftsum+=nums[i];
            long rightsum = totalsum-leftsum;
            if(leftsum>=rightsum)
            {
                count++;
            }
        }
        return count;
    }
}
