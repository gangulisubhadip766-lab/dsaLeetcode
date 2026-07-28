class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> list=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                if(list.contains(third)){
                   List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                   Collections.sort(temp);
                   set.add(temp);
                }
                list.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}