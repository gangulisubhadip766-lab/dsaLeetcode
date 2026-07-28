class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> list=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                boolean exists=list.contains(third);
                if(exists){
                   List<Integer> temp=new ArrayList<>();
                   temp.add(nums[i]);
                   temp.add(nums[j]);
                   temp.add(third);
                   Collections.sort(temp);
                   set.add(temp);
                }
                list.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}