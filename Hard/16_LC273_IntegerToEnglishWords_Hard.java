class Solution {
    String[] a= {
        "","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
    }
    ,b= {
        "","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"
    }
    ,c= {
        "","Thousand","Million","Billion"
    }
    ;
    public String numberToWords(int n) {
        if(n==0)return "Zero";
        StringBuilder s=new StringBuilder();
        int g=0;
        while(n>0) {
            int x=n%1000;
            if(x>0) {
                String t=p(x)+(c[g].isEmpty()?"":" "+c[g]);
                if(s.length()>0)s.insert(0," ");
                s.insert(0,t);
            }
            n/=1000;
            g++;
        }
        return s.toString();
    }
    String p(int n) {
        if(n==0)return "";
        if(n<20)return a[n];
        if(n<100)return b[n/10]+(n%10==0?"":" "+p(n%10));
        return a[n/100]+" Hundred"+(n%100==0?"":" "+p(n%100));
    }
}

