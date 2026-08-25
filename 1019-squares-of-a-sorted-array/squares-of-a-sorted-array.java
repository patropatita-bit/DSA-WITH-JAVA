class Solution {
    public int[] sortedSquares(int[] nums) {
        int L=0;
        int R=nums.length-1;
        while(L <= R){
            if(L== R){
             nums[L]=(int)Math.pow(nums[L],2);

            }else{
                nums[L]=(int)Math.pow(nums[L],2);
      nums[R]=(int)Math.pow(nums[R],2);
            }
      
      
        L++;
        R--;
        }
        Arrays.sort(nums);
        return  nums;
    }
}