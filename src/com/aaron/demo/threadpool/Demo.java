package com.aaron.demo.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(new Printer(0));
        service.submit(new Printer(0));
        service.submit(new Printer(0));
        service.submit(new Printer(0));
        service.submit(new Printer(0));
        service.submit(new Printer(0));
        service.submit(new Printer(0));
    }
}
