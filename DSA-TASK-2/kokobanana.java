class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length, left = 1, right = Arrays.stream(piles).max().getAsInt();

        while(left < right){
            int mid = (left + right)/2;

            if(canBanana(piles, h, mid)) right = mid;
            else left = mid + 1;
        }

        return left;
    }

    public boolean canBanana(int[] piles, int h, int mid){
        int time = 0;

        for(int i : piles){
            time += i/mid;
            if(i%mid != 0 ) time++;
        }

        return time <= h;
    }
}