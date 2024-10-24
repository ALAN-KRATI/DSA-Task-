class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length-1, max = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] < arr[mid+1]){
                max = mid+1;
                left = mid + 1;
            }

            else if(arr[mid] < arr[mid - 1]){
                max = mid - 1;
                right = mid -1;
            }

            else return mid;
        }

        return max;
    }
}