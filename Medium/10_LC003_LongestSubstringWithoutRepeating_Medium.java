import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int l=0,b=0;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(m.containsKey(c))l=Math.max(l,m.get(c)+1);
            m.put(c,i);
            b=Math.max(b,i-l+1);
        }
        return b;
    }
}

