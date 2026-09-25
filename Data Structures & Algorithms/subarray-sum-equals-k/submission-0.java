class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=0;
        int count=0;
        int x=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int r=0;r<nums.length;r++){
            x+=nums[r];
            if(map.containsKey(x-k)){
            count=count+map.get(x-k);}
            map.put(x,map.getOrDefault(x,0)+1);

        }
        return count;
        
    }
}