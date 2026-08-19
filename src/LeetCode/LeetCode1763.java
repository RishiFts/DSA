package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1763 {

    static void main() {

        LeetCode1763 leetCode1763 = new LeetCode1763();
        System.out.println(leetCode1763.longestNiceSubstring("YazaAay"));

    }

    public String longestNiceSubstring(String s) {

        int len = s.length();
        int maxLen = 0;

        for(int i = 0; i < len; i++)
        {
            if(niceString(String.valueOf(s.charAt(i))))
            {

            }
        }
    }

    public boolean niceString(String st)
    {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<st.length();i++)
        {
            set.add(st.charAt(i));
        }

        for(int i=0;i<st.length();i++)
        {
            if(Character.isLowerCase(st.charAt(i)) &&  set.contains(Character.toLowerCase(st.charAt(i))))
            {
                return true;
            }

            if(Character.isUpperCase(st.charAt(i)) && set.contains(Character.toUpperCase(st.charAt(i))))
            {
                return true;
            }
        }

        return false;
    }
}
