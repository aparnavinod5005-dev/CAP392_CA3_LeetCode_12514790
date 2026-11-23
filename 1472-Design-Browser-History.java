import java.util.*;
class BrowserHistory {
    List<String> h=new ArrayList<>();
    int c=0,last=0;
    public BrowserHistory(String s) {
        h.add(s);
    }
    public void visit(String u) {
        c++;
        if(c<h.size())h.set(c,u);
        else h.add(u);
        last=c;
    }
    public String back(int n) {
        c=Math.max(0,c-n);
        return h.get(c);
    }
    public String forward(int n) {
        c=Math.min(last,c+n);
        return h.get(c);
    }
}

