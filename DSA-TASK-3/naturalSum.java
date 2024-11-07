import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(NaturalSum(n));
    }

    static int sum = 0;
    public static int NaturalSum(int n){
       if(n == 0) return sum;

       sum = sum + n;
       NaturalSum(n-1);

       return sum;
    }
}
