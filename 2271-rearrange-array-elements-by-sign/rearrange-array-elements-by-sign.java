class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        int j=0;
        for(int i=0;i<n;i=i+2){
            nums[i]=pos.get(j);
            j++;
        }
        int k=0;
        for(int i=1;i<n;i=i+2){
            nums[i]=neg.get(k);
            k++;
        }
        return nums;
    }
}