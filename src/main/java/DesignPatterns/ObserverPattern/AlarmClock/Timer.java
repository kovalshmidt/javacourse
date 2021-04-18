package DesignPatterns.ObserverPattern.AlarmClock;

public interface Timer {
    void addAlarm(Alarm alarm);
    void removeAlarm(Alarm alarm);
    void notifyAlarm();
    void startClockWork();
}
