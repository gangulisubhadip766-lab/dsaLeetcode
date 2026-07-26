class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max1){
                max1=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>max2 && nums[i]!=max1){
                max2=nums[i];
            }
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(nums[i]>=max3 && nums[i]!=max1 && nums[i]!=max2){
                max3=nums[i];
                flag=true;
            }
        }
        if(flag==false) return max1;
        return max3;
    }
}