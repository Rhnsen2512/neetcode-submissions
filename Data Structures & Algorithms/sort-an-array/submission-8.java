class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
    for(int i=0;i<=n-2;i++){
        int min=i;
        for(int j=i;j<=n-1;j++){
            if(nums[min]>nums[j])min=j;

        }
        int temp=nums[i];
        nums[i]=nums[min];
        nums[min]=temp;
    }
return nums;
    }
}