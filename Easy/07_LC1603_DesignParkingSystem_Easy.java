class ParkingSystem {
    int[] s=new int[4];
    public ParkingSystem(int b,int m,int small) {
        s[1]=b;
        s[2]=m;
        s[3]=small;
    }
    public boolean addCar(int t) {
        if(s[t]==0)return false;
        s[t]--;
        return true;
    }
}

