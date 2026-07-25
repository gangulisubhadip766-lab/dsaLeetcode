class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] temp=new int[k];
        int d=n-k;
        for(int i=0;i<k;i++){
            temp[i]=nums[d];
            d++;
        }
        int i=n-1;
        for(int j=n-k-1;j>=0;j--){
            nums[i]=nums[j];
            i--;
        }
        for(int j=0;j<k;j++){
            nums[j]=temp[j];
        }
    }
}