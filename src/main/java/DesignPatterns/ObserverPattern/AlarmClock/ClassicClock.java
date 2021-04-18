package DesignPatterns.ObserverPattern.AlarmClock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClassicClock implements Timer {

    private List<Alarm> alarms;
    private int second;
    private int minute;
    private int hour;

    public ClassicClock(int second, int minute, int hour) {
        if (second < 59) {
            this.second = second;
        } else {
            this.second = 59;
        }
        if (minute < 59) {
            this.minute = second;
        } else {
            this.minute = 59;
        }
        if (hour < 23) {
            this.hour = second;
        } else {
            this.hour = 23;
        }
        this.alarms = new ArrayList<>();
    }

    @Override
    public void addAlarm(Alarm alarm) {
        this.alarms.add(alarm);
    }

    @Override
    public void removeAlarm(Alarm alarm) {
        this.alarms.remove(alarm);
    }

    @Override
    public void notifyAlarm() {
        System.out.printf("%d:%d:%d \n", this.hour, this.minute, this.second);
        for (Alarm alarm : this.alarms) {
            alarm.checkClock(this.second, this.minute, this.hour);
        }
    }

    public void startClockWork() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
                this.second++;
                if (this.second > 59) {
                    this.second = 0;
                    this.minute++;
                    if (this.minute > 59) {
                        this.minute = 0;
                        this.hour++;
                        if (this.hour > 23) {
                            this.hour = 0;
                        }
                    }
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            this.notifyAlarm();
        }
    }
}
