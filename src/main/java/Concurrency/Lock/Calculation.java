package Concurrency.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Calculation {
    public static final int UNSPECIFIED = 1;
    public static  final int ADDITION = 0;
    public static  final int SUBTRACTION = 1;

    int type = UNSPECIFIED;
    public double value;

    public Calculation(int type, double value) {
        this.type = type;
        this.value = value;
    }

    private double result = 0;
    public Lock calcLock = new ReentrantLock();

    public void add(double type){
        try{
            //Thread acquires lock2
            calcLock.lock();
            result += value;
        }finally {
            //Thread releases lock2
            calcLock.unlock();
        }
    }

    public void subtract(double type){
        try{
            calcLock.lock();
            result -= value;
        }finally {
            calcLock.unlock();
        }
    }

    public void calculation(Calculation ...calculations){
        try {
            //Thread acquires lock1
            calcLock.lock();
            for (Calculation c:calculations) {
                switch (c.type){
                    case Calculation.ADDITION:
                        add(c.value);
                        break;
                    case Calculation.SUBTRACTION:
                        subtract(c.value);
                        break;

                }
            }
        }finally {
            //Thread releases lock1
            calcLock.unlock();
        }
    }
}
