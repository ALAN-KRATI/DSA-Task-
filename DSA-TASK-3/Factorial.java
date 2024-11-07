import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Factorial(n));
    }

    static int sum = 1;
    public static int Factorial(int n){
       if(n == 0) return sum;

       sum = sum * n;
       Factorial(n-1);

       return sum;
    }
}
