import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int n=0;
        for(int i=0;i<s.length();i++) {
            int v=m.get(s.charAt(i));
            n+=i+1<s.length()&&v<m.get(s.charAt(i+1))?-v:v;
        }
        return n;
    }
}

