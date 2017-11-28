package com.barclays.fraud.freature.schedule;

import java.util.concurrent.*;

public class SparkJobScheduler {
    private static ScheduledExecutorService scheduler = null;

    public SparkJobScheduler(int poolsize){
        scheduler = new ScheduledThreadPoolExecutor(poolsize);
    }

    public <T> Future<T> schedule(Callable<T> callable, long delay){
        return scheduler.schedule(callable, delay, TimeUnit.MILLISECONDS);
    }

    @Override
    protected void finalize() throws Throwable {
        scheduler.shutdown();
        System.out.println("Scheduler shutdown!");
        super.finalize();
    }
}
