package pl.kocan.command.pattern.workshop.command;

import pl.kocan.command.pattern.workshop.Robot;

public class RobotDrillCommand implements Command {

    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.drill();
    }

    @Override
    public void undo() {

    }
}
