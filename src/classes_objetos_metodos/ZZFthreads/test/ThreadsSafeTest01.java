package classes_objetos_metodos.ZZFthreads.test;

import java.util.*;

class ThreadSafeNames{
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name){
        names.add(name);
    }

//    public void removeFirst(){
//        if(names.size() > 0 ) System.out.println(names.remove(0)); }
    public synchronized void removeFirst(){
        if(!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}

public class ThreadsSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");
        Runnable r = threadSafeNames::removeFirst;

        new Thread(r).start();
        new Thread(r).start();
    }
}
