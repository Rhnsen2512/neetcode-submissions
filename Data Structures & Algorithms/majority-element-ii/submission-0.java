class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for( int i=0;i<n;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
        }

        for(Map.Entry<Integer,Integer> ent: map.entrySet()){
            if(ent.getValue()>(n/3)) ans.add(ent.getKey());
        }
        return ans;
        
    }
}