class Solution {

    public String encode(List<String> strs) {
        int n=strs.size();
        StringBuffer sb=new StringBuffer();
        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
        


    }

    public List<String> decode(String str) {
        List<String> ans= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int start= j+1;
            int length=Integer.parseInt(str.substring(i,j));
          
            String word=  str.substring(start, start+length);
            ans.add(word);
            i=start+length;
            
        }
        return ans;



    }
}
