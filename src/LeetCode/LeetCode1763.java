package LeetCode;

public class LeetCode1763 {

    static void main() {

        LeetCode1763 leetCode1763 = new LeetCode1763();
        System.out.println(leetCode1763.longestNiceSubstring("YazaAay"));

    }

    public String longestNiceSubstring(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            char lowerCase = Character.toLowerCase(s.charAt(i));
            char upperCase = Character.toUpperCase(s.charAt(i));
            if(s.indexOf(lowerCase) == -1 && s.indexOf(upperCase) == -1)
            {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
