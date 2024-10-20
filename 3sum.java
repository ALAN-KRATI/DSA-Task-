class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(num);

        for(int i = 0 ; i < num.length - 2; i++){
            if(i > 0 && num[i] == num[i-1]){
                continue;
            }
            int j = i + 1;
            int k = num.length - 1;

            while(j < k){
                int sum = num[i] + num[j] + num[k];
                if(sum == 0) {
                    ans.add(Arrays.asList(num[i], num[j], num[k]));
                   

                    while (j < k && num[j] == num[j + 1]){
                        j++;
                    }

                    while (j < k && num[k] == num[k - 1]){
                        k--;
                    }

                    j++;
                    k--;

                }

                else if (sum < 0) {
                        j++;
                }

                else k--;

            }
        }

        return ans;


    }
}