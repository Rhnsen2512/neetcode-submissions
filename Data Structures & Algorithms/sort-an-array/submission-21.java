class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
      int low=0;
      int high=n-1;

    
     return qs(nums,low,high);
    }
     public static int[] qs(int[] nums,int low,int high){
      if(low<high){
      int pIndex=findPartitionIndex(nums,low,high);
       qs(nums,low,pIndex-1);
       qs(nums,pIndex+1,high);
      }
       return nums;
     }
     public static Integer findPartitionIndex(int[] nums,int low,int high){
      int pivot=nums[low];
      int i=low;
      int j=high;
      while(i<j){
        while(  i<=high-1 && nums[i]<=pivot){
          i++;
        }
        while( j>=low+1 && nums[j]>pivot){
          j--;
        }
        if(i<j){
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
        }
      }
     int temp=nums[low];
     nums[low]=nums[j];
     nums[j]=temp;
     return j;


     }
}