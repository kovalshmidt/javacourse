package DesignPatterns.ObserverPattern.AlarmClock;

import DesignPatterns.ObserverPattern.Subject;

public class AlarmImplementation implements Alarm {
    public int second;
    public int minute;
    public int hour;

    private static int alarmIDTracker = 0;
    private int alarmID;
    private Timer clock;

    public AlarmImplementation(Timer timer, int sec, int min, int hour) {
        this.clock = timer;
        alarmIDTracker++;
        this.alarmID = alarmIDTracker;
        this.second = sec;
        this.minute = min;
        this.hour = hour;
        this.clock.addAlarm(this);
    }

    @Override
    public void checkClock(int sec, int min, int hour) {
        if ((this.second == sec) && this.minute == min && this.hour == hour) {
            System.out.println("WAKE UP!" + alarmID);
        }
    }

}
