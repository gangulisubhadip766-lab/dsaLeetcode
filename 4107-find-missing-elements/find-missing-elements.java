class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        int count=nums[0];
        for(int i=0;i<n;){
            if(nums[i]!=count){
                ans.add(count);
            }
            else i++;
            count++;
        }
        return ans;
    }
}