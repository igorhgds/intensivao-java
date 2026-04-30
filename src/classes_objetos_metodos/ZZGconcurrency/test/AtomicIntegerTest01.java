package classes_objetos_metodos.ZZGconcurrent.test;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    private int count;

    private final AtomicInteger atomicInteger = new AtomicInteger();

//    void increment(){ count++; }                  // in this case without synchronized, the result was 14889 or 17345. Because lost increments
//    synchronized void increment(){ count++;}      // with synchronized the result was 20000 exactly

    void increment(){
        count++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}
public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
