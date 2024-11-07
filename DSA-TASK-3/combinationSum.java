class Solution {
      private static void print(int[] arr, int target, List<Integer> list, List<Integer> ans){
        if(target == 0){
            System.out.print(list + " ");
            List<Integer> ll = new ArrayList<Integer>(list);
 //           ans.add(ll);
            return;
        }

        if(target < 0) return;

        for(int i = 0 ; i < arr.length; i++){
            list.add(arr[i]);
            print(arr, target-arr[i], list, ans);
            list.remove(list.size()-1);
        }
    }
}