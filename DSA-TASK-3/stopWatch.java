import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        stopWatch(n, 1);
    }

    public static void stopWatch(int n, int d){
        System.out.println(d);
        if(n == d) return;
        stopWatch(n, d+1);
    }
}
