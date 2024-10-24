class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = (position[position.length - 1] - position[0]);

        while(left <= right){
            int mid = (right + left)/2;

            if(canPutBalls(position, m, mid)) left = mid + 1;
            else right = mid - 1;
        }

        return right;
    }

    public boolean canPutBalls(int[] position, int m, int mid){
        int balls = 1, pos = position[0];

        for(int i = 1; i < position.length ; i++){
            if(position[i] - pos >= mid){
                balls++;
                pos = position[i];

                if(balls == m) return true;
            }
        }

        return false;
    }
}