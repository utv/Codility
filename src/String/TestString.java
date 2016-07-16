package String;

/**
 * Created by Amata on 1/24/2016 AD.
 */
public class TestString {

    public static void main(String[] args) {
        String s = "( coins x 5 )";
        System.out.println(s.indexOf("coins x "));
        System.out.println(s.charAt(s.lastIndexOf("coins x ") + "coins x ".length()));
        String bid = "( bid 0 no_tiebreaker )";
        System.out.println(bid.charAt(bid.indexOf("bid") + "bid ".length()));
        String state = "( coins x 6 )";
        int xCoins = Character.getNumericValue(state.charAt(state.indexOf("coins x ") + "coins x ".length()));
        System.out.println(xCoins);
    }
}
