import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, target, 0, arr.length-1 ));
    }

    public static int isSorted(int[] arr, int target, int st, int end){
        if(st > end) return -1;

        int mid = st + (end - st)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) isSorted(arr, target, mid + 1, end);
        else isSorted(arr, target, st, mid - 1);

        return mid;
    }
}
