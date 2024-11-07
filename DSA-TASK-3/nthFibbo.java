import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Factorial(n));
    }


    public static int Factorial(int n){
       if(n == 0) return 0;
       if(n == 1) return 1;

       return Factorial(n-1) + Factorial(n-2);
    }
}
