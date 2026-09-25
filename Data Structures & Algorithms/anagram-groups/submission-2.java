class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> ans= new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();
        for(String str: strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String key= String.valueOf(c);
           map.putIfAbsent(key,new ArrayList<>());
           map.get(key).add(str);
        }
        ans.addAll(map.values());
        return ans;

        
    }
}
