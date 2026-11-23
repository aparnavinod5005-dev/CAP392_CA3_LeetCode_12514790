class MyLinkedList {
    static class N {
        int v;
        N n;
        N(int v) {
            this.v=v;
        }
    }
    N h=new N(0);
    int size;
    public MyLinkedList() {
    }
    public int get(int i) {
        if(i<0||i>=size)return -1;
        N c=h.n;
        while(i-->0)c=c.n;
        return c.v;
    }
    public void addAtHead(int v) {
        addAtIndex(0,v);
    }
    public void addAtTail(int v) {
        addAtIndex(size,v);
    }
    public void addAtIndex(int i,int v) {
        if(i>size)return;
        if(i<0)i=0;
        N p=h;
        while(i-->0)p=p.n;
        N x=new N(v);
        x.n=p.n;
        p.n=x;
        size++;
    }
    public void deleteAtIndex(int i) {
        if(i<0||i>=size)return;
        N p=h;
        while(i-->0)p=p.n;
        p.n=p.n.n;
        size--;
    }
}

