package com.client.core.base.service.concurrency.impl;

import com.client.core.base.service.concurrency.ConcurrencyService;
import com.google.common.collect.Lists;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

/**
 * Service to handle calling threads asynchronously as well as synchronously.  Provided methods to call
 * a single thread asynchronously or a collection of threads either asynchronously or synchonously.
 * Supports both {@link Runnable} and {@link Callable}.
 * <br><br>
 * Implementation uses {@link Executors} and {@link ExecutorService}
 */
@Log4j2
@Service
public class StandardConcurrencyService implements ConcurrencyService {

    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            synchronized(this) {
                log.error("Uncaught exception in thread {}", t.getId(), e);
            }
        }
    };

    ThreadFactory threadFactory = r -> {
        final Thread thread = new Thread(r);
        thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        return thread;
    };

    /**
     * {@inheritDoc}
     */
    @Override
    public <T, C extends Callable<T>> List<T> spinThreadsAndWaitForResult(List<C> taskList) {
        return this.handleCallableList(taskList, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T, C extends Callable<T>> void spinThreadsAndDoNotWaitForResult(List<C> taskList) {
        this.handleCallableList(taskList, false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T, C extends Callable<T>> void spinOneThreadAndDoNotWaitForResult(C task) {
        this.handleCallableList(Lists.newArrayList(task), false);
    }

    private <T, C extends Callable<T>> List<T> handleCallableList(List<C> taskList, boolean wait) {
        if (taskList == null || taskList.isEmpty()) {
            return Collections.emptyList();
        }

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        // First get all the FileContent
        List<Future<T>> futureList = new ArrayList<Future<T>>();

        for (C task : taskList) {
            Future<T> futureResult = executor.submit(task);

            futureList.add(futureResult);
        }

        List<T> taskResultList = new ArrayList<T>();

        for (Future<T> future : futureList) {
            try {
                taskResultList.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                log.error("Error in ConcurrencyService.spinThreads", e);
            }
        }

        executor.shutdown();

        if (wait) {
            while (!executor.isTerminated()) {
            }
            executor = null;
        }

        return taskResultList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <R extends Runnable> void spinOneThreadAndDoNotWaitForCompletion(R task) {
        this.handleRunnableList(Lists.newArrayList(task), false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <R extends Runnable> void spinThreadsAndWaitForCompletion(List<R> taskList) {
        this.handleRunnableList(taskList, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <R extends Runnable> void spinThreadsAndDoNotWaitForCompletion(List<R> taskList) {
        this.handleRunnableList(taskList, false);
    }

    private <R extends Runnable> void handleRunnableList(List<R> taskList, boolean wait) {
        if (taskList == null || taskList.isEmpty()) {
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), threadFactory);

        for(R task : taskList) {
            executor.execute(task);
        }

        executor.shutdown();

        if (wait) {
            while (!executor.isTerminated()) {
            }
            executor = null;
        }
    }

}
