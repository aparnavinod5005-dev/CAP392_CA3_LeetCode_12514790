import java.util.concurrent.CountDownLatch;
class Foo {
    CountDownLatch a=new CountDownLatch(1),b=new CountDownLatch(1);
    public Foo() {
    }
    public void first(Runnable r)throws InterruptedException {
        r.run();
        a.countDown();
    }
    public void second(Runnable r)throws InterruptedException {
        a.await();
        r.run();
        b.countDown();
    }
    public void third(Runnable r)throws InterruptedException {
        b.await();
        r.run();
    }
}

