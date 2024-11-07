class Solution {
    public int findTheWinner(int n, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        for(int i = 1; i <= n; i++){
            dq.add(i);
        }
        int c = 1;
        while(dq.size() > 1){
            c = 1;

            while(c < k){
                dq.addLast(dq.removeFirst());
                c++;
            }
            dq.removeFirst();
        }

        return dq.removeFirst();

    }
}