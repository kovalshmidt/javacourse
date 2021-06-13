package DesignPatterns.CommandPattern.Cheatcodes;

public class CodeExecution {
    Command command;

    public CodeExecution(Command command) {
        this.command = command;
    }

    void enter(){
        command.execute();
    }

}
