package io.github.rimonmostafiz.core.concurrency;

/**
 * @author Rimon Mostafiz
 */
public class SynchronizedMethods {
    private int sum = 0;

    public static int staticSum = 0;

    public int getSum() { return this.sum; }

    public void setSum(int sum) { this.sum = sum; }

    public void calculate() {
        setSum(getSum() + 1);
    }

    // Synchronized Instance methods
    public synchronized void synchronizedCalculate() {
        setSum(getSum() + 1);
    }

    // Synchronized Static Methods
    public static synchronized void syncStaticCalculate() {
        staticSum = staticSum + 1;
    }

    //Synchronized Block within methods
    public void performSynchronisedTask() {
        synchronized (this) {
            setSum(getSum() + 1);
        }
    }
}
