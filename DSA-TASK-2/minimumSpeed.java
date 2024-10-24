class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 1, right = 10000000, speed = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(isPossible(dist, hour, mid)){
                speed = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }

        return speed;
    }

    public boolean isPossible(int[] dist, double hour, int mid){
        double time = 0;
        
        for(int i = 0; i < dist.length; i++){
            double t = (double)dist[i]/ mid;

            if(i != dist.length-1){
                time += Math.ceil(t);
            }

            else time += t;

            if(time  > hour) return false;
        }

        return time  <= hour;
    }
}