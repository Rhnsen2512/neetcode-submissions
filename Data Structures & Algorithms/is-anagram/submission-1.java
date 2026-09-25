class Solution {
    public boolean isAnagram(String s, String t) {
         Map<Character,Integer> map=new LinkedHashMap<>();
        Map<Character,Integer> map1=new LinkedHashMap<>();
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        for(int i=0;i<n1;i++){
        if(map.containsKey(s1[i])){
            map.put(s1[i],map.get(s1[i])+1);
        }else{
           map.put(s1[i],1);
        }
        }
 for(int i=0;i<n1;i++){
        if(map1.containsKey(t1[i])){
            map1.put(t1[i],map1.get(t1[i])+1);
        }else{
           map1.put(t1[i],1);
        }
        }


        for(int i=0;i<n1;i++){
            if(!Objects.equals(map1.get(s1[i]),map.get(s1[i]))) return false;
        }
        return true;
        

    }
}
