class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       List<List<Integer>> ans= new ArrayList<>();
       Set<List<Integer>> set= new HashSet<>();
       for(int i=0;i<n;i++){
        Set<Integer> hs= new HashSet<>();
        for(int j=i+1;j<n;j++){

        int third=-(nums[i]+nums[j]);
        if(hs.contains(third)){
            set.add(Arrays.asList(nums[i],nums[j],third));
        }
        hs.add(nums[j]);
        }

       }
       for(List<Integer> list: set){
        ans.add(list);
       }

       return ans;
        
    }
}
