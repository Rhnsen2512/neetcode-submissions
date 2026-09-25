class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                if(i<map.get(target-nums[i])){
                    ans[0]=i;
                    ans[1]=map.get(target-nums[i]);
                }else{
                    ans[0]=map.get(target-nums[i]);
                    ans[1]=i;
                }

            }
            map.put(nums[i],i);
            
        }
        return ans;
        
    }
}
