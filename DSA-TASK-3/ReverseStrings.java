import java.util.*;

public class TBPPP {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String n = sc.next();
        System.out.println(ReverseStrings(n));
    }

    static String ans = "";
    public static String ReverseStrings(String n){
        if(n.isEmpty()) return "";

        ans += n.charAt(n.length()-1);
        ReverseStrings(n.substring(0, n.length()-1));
       
       return ans;
    }
}
