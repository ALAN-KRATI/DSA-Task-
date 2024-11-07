import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        if(pow == 1) System.out.println(n);
        System.out.println(Power(n, pow));
    }

    static int ans = 1;
    public static int Power(int n, int pow){
       if(pow == 0) return 0;
       
       ans = ans * n;
       Power(n, pow-1);
       
       return ans;
    }
}
