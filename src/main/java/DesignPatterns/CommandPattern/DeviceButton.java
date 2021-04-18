package DesignPatterns.CommandPattern;

/**
 * This is the invoker
 */

public class DeviceButton{
    Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    void press(){
        command.execute();
    }

    void undo(){
        command.undo();
    }
}
