class Solution {
   public int sumSubarrayMins(int[] arr) {
    long res = 0;
    Deque<Integer> stack = new ArrayDeque<>();
    for(int i = 0; i <= arr.length; i++) {
        while(!stack.isEmpty() && (i == arr.length || arr[stack.peek()] > arr[i])) {
            int mid = stack.pop(), L = mid - (stack.isEmpty() ? -1 : stack.peek()), R = i - mid;
            res += (long) arr[mid] * L * R;
        }
        stack.push(i);
    }
    return (int) (res % 1_000_000_007);
}
}