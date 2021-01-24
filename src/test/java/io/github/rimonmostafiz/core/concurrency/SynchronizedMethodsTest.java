package io.github.rimonmostafiz.core.concurrency;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rimon Mostafiz
 */
class SynchronizedMethodsTest {

    private static ExecutorService service;

    private SynchronizedMethods summation;

    @BeforeAll
    public static void beforeAll() {
        service = Executors.newFixedThreadPool(3);
    }

    @BeforeEach
    public void init() {
        this.summation = new SynchronizedMethods();
    }

    @Test
    public void givenMultiThread_whenNonSyncMethod() throws InterruptedException {

        IntStream.range(0, 1000).forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        assertNotEquals(1000, summation.getSum());
    }

    @Test
    public void givenMultiThread_whenSyncMethod() throws InterruptedException {

        IntStream.range(0, 1000).forEach(count -> service.submit(summation::synchronizedCalculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        assertEquals(1000, summation.getSum());
    }

    @Test
    public void givenMultiThread_whenStaticSyncMethod() throws InterruptedException {
        IntStream.range(0, 1000)
                .forEach(count ->
                        service.submit(SynchronizedMethods::syncStaticCalculate));
        service.awaitTermination(100, TimeUnit.MILLISECONDS);

        assertEquals(1000, SynchronizedMethods.staticSum);
    }

    @Test
    public void givenMultiThread_whenBlockSync() throws InterruptedException {
        IntStream.range(0, 1000)
                .forEach(count ->
                        service.submit(this.summation::performSynchronisedTask));
        service.awaitTermination(100, TimeUnit.MILLISECONDS);

        assertEquals(1000, this.summation.getSum());
    }

}