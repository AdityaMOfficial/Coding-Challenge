import java.util.Stack;

public class ReplaceLetter {

    private static void solve(String str){
        str = str.replaceAll("[(]+[)]","o");
        str = str.replaceAll("[(]+a+l+[)]","al");
        System.out.println(str);
    }

    public static void main(String[] args) {
        solve("(al)G(al)()()G");
    }
}
