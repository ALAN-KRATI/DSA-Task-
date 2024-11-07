import java.util.*;
class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        counter(n);
    }

    public static void counter(int n){
        if(n == 0) return;

        System.out.println(n);
        counter(n-1);
    }
}
