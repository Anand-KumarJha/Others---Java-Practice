class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    public void quickSort(int[] nums, int start, int end){
        if(start<end){
            int pivot = partition(nums,start,end);
            quickSort(nums, start, pivot-1);
            quickSort(nums, pivot+1, end);
        }
    }

    public int partition(int[] nums, int start, int end){
        int i = start-1;
        int pivot = end;
        for(int j = start; j <= end; j++){
            if(nums[j] <= nums[pivot]){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return i;
    }
}