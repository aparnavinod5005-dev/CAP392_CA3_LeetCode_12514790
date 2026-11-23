class MyHashSet {
    boolean[] a=new boolean[1000001];
    public MyHashSet() {
    }
    public void add(int k) {
        a[k]=true;
    }
    public void remove(int k) {
        a[k]=false;
    }
    public boolean contains(int k) {
        return a[k];
    }
}

