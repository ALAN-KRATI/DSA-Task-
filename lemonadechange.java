class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fBucks = 0, tBucks = 0;

        for(int i : bills){
            if(i == 5) fBucks++;
            else if(i == 10){
                if(fBucks > 0){
                    fBucks--;
                    tBucks++;
                }
                else return false;
            }
            else{
                if(fBucks > 0 && tBucks > 0){
                    fBucks--;
                    tBucks--;
                }
                else if(fBucks > 2) fBucks -= 3;
                else return false;
            }
        }

        return true;
    }
}