class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }

    public void sort(int[] nums,int start,int end){
        if(start < end){
            int mid = (start + end)/2;
            sort(nums,start, mid);
            sort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }

    }

    public void merge(int[] nums, int start, int mid, int end){
        int[] startTemp = new int[mid - start + 2];
        int[] endTemp = new int[end - mid + 1];


        for(int i = 0; i <= mid-start; i++){
            startTemp[i] = nums[start+i];
        }
        for(int i = 0; i < end-mid; i++){
            endTemp[i] = nums[mid+1+i];
        }
        startTemp[mid-start+1] = Integer.MAX_VALUE;
        endTemp[end-mid] = Integer.MAX_VALUE;

        int j = 0,k = 0;
        for(int i = start; i <= end; i++){
            if(startTemp[j] < endTemp[k]){
                nums[i] = startTemp[j];
                j++;
            }else{
                nums[i] = endTemp[k];
                k++;
            }
        }

    }
}