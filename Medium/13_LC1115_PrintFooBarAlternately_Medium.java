import java.util.concurrent.Semaphore;
class FooBar {
    int n;
    Semaphore f=new Semaphore(1),b=new Semaphore(0);
    public FooBar(int n) {
        this.n=n;
    }
    public void foo(Runnable r)throws InterruptedException {
        for(int i=0;i<n;i++) {
            f.acquire();
            r.run();
            b.release();
        }
    }
    public void bar(Runnable r)throws InterruptedException {
        for(int i=0;i<n;i++) {
            b.acquire();
            r.run();
            f.release();
        }
    }
}

