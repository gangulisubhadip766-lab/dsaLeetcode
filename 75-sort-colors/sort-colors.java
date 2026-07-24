class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            boolean isSorted=true;
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted==true) break;
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}