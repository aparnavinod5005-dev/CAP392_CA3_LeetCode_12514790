class Solution {
    public double findMedianSortedArrays(int[] a,int[] b) {
        if(a.length>b.length)return findMedianSortedArrays(b,a);
        int m=a.length,n=b.length,l=0,r=m;
        while(l<=r) {
            int i=(l+r)/2,j=(m+n+1)/2-i;
            int x=i==0?Integer.MIN_VALUE:a[i-1],y=i==m?Integer.MAX_VALUE:a[i],u=j==0?Integer.MIN_VALUE:b[j-1],v=j==n?Integer.MAX_VALUE:b[j];
            if(x<=v&&u<=y)return(m+n)%2==0?((double)Math.max(x,u)+Math.min(y,v))/2:Math.max(x,u);
            if(x>v)r=i-1;
            else l=i+1;
        }
        return 0;
    }
}

