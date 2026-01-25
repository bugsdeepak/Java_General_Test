package main.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

interface Iterator<T> {
    public boolean hasNext();
    public T next();
}

class ArrayListIterator<T> implements Iterator<T> {

    private final List<T> arr;
    private volatile AtomicInteger counter;

    public ArrayListIterator(List<T> param) {
        this.arr = param;
        this.counter = new AtomicInteger(0);
    }
    @Override
    public boolean hasNext() {
        return counter.get() < arr.size();
    }

    @Override
    public T next() {
        return arr.get(counter.getAndIncrement());
    }
}

public class ThreadSafeIterator {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        for(int i=1; i<10000; i++) {
            array.add(Integer.toString(i));
        }
        ArrayListIterator<String> arrayListIterator = new ArrayListIterator<>(array);
        ExecutorService executors = Executors.newFixedThreadPool(5);
        for(int i=0; i<5; i++) {
            executors.execute(() -> {
                while(arrayListIterator.hasNext()) {
                    System.out.println("Thread" + Thread.currentThread().getName() + "->" + arrayListIterator.next());
                }
                executors.shutdown();
            });
        }
    }
}