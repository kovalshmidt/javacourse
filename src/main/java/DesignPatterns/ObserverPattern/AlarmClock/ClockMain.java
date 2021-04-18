package DesignPatterns.ObserverPattern.AlarmClock;

public class ClockMain {
    public static void main(String[] args) {
        ClassicClock clock1 = new ClassicClock(0,0,0);
        AlarmImplementation alarm = new AlarmImplementation(clock1,15,0,0);
        AlarmImplementation alarm2 = new AlarmImplementation(clock1,30,0,0);

        clock1.startClockWork();

    }
}
