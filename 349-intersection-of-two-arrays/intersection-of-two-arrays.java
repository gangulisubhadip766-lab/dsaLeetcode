class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<n1 && j<n2){
           if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                if(arr.size()==0 || arr.get(arr.size()-1)!=nums1[i]){
                    arr.add(nums1[i]);
                }    
                i++;
                j++;
            } 
        }
        int[] ans=new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            ans[k]=arr.get(k);
        }
        return ans;
    }
}