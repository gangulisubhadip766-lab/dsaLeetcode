class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            int ele=-1;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    ele=nums[i];
                    count++;
                } 
            }
            if(count>n/2) return ele;
        }
        return -1;
    }
}