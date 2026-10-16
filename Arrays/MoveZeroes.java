class Solution {
    public void moveZeroes(int[] nums) {
        
        int k = 0;
        for (int j = 0 ; j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp; 
                k++;              
            }
        }
    }
}
