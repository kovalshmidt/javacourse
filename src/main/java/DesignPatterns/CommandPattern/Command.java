package DesignPatterns.CommandPattern;

/**
 * Each command you want to issue will implement a command interface
 */
public interface Command {
    void execute();
    void undo();
}
