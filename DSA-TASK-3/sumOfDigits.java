import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }

    static int ans = 0;
    public static int sumOfDigits(int n){
       if(n == 0) return 0;
       
       int r = n%10;
       ans += r;
       sumOfDigits(n/10);
       
       return ans;
    }
}
