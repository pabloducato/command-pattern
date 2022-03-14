package pl.kocan.command.pattern.workshop.command;

public interface Command {

    void execute();

    void undo();
}
