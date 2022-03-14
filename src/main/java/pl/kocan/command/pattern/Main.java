package pl.kocan.command.pattern;

import pl.kocan.command.pattern.workshop.Robot;
import pl.kocan.command.pattern.workshop.WorkshopApp;
import pl.kocan.command.pattern.workshop.command.RobotTurnOnCommand;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        final WorkshopApp workshopApp = new WorkshopApp();

//        workshopApp.addCommandToQueue(new RobotTurnOnCommand(robot));
//        workshopApp.addCommandToQueue(new RobotCutCommand(robot));
//        workshopApp.addCommandToQueue(new RobotDrillCommand(robot));
//        workshopApp.addCommandToQueue(new RobotTurnOffCommand(robot));
//
//        workshopApp.run();
//        workshopApp.run();
//
//        CoffeeMaker coffeeMaker = new CoffeeMaker();
//
//        workshopApp.addCommandToQueue(new CoffeeMakerTurnOnCommand(coffeeMaker));
//        workshopApp.addCommandToQueue(new CoffeeMakerTurnOffCommand(coffeeMaker));
//
//        workshopApp.run();

        workshopApp.addCommandToQueue(new RobotTurnOnCommand(robot));

        workshopApp.run();

        workshopApp.undoLastCommand();
    }
}
