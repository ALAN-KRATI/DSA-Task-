import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1) return true;

        if(arr[idx] < arr[idx + 1]) isSorted(arr, idx + 1);

        return false;


    }
}
