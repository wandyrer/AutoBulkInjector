package com.stubhub.autobulkinjector;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Future;
import javax.jms.ConnectionFactory;
import javax.persistence.

/**
 * Created by wandyrer on 6/20/2015.
 */
public class BulkInjectorRunner implements Runnable {

    private static ConcurrentLinkedDeque<Future<Report>> processingQueue;

    private ConnectionFactory connectionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    private long lastRun = -1L;


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }

    public static addReport(BulkRequestRunner request, Report report)

    private List<BulkRequestRunner> fetchRequests(long lastRun) {

    }

}
