class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int j=-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
             j=i;
             break;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=val) count++;
        }
       if(j!= -1){
        for(int i=j+1;i<n;i++){
            if(nums[i]!=val){
                
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
       
       }

       return count;
         
        
    }
}