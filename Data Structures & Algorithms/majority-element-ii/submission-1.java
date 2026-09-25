class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int el1=0;
        int el2=0;
        int cnt1=0;
        int cnt2=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }else if(cnt2 ==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }else if(nums[i]==el1) cnt1++;
            else if(nums[i]==el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
         int cnt11=0;
         int cnt22=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) cnt11++;
            else if(nums[i]==el2) cnt22++;
        }

        if(cnt11>(n/3)) ans.add(el1);
        if(cnt22>(n/3)) ans.add(el2);

        return ans;
        
        
    }
}