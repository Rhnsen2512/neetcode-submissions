class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());
        int[] ans=new int[k];
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b){
                return b.getValue()-a.getValue();
            }
        });
      for(int i=0;i<k;i++){
        ans[i]=list.get(i).getKey();
      }
      return ans;
    }
}
