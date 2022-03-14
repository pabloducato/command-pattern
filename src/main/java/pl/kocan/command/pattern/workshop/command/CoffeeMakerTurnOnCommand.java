package pl.kocan.command.pattern.workshop.command;

import pl.kocan.command.pattern.workshop.CoffeeMaker;

public class CoffeeMakerTurnOnCommand implements Command {

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOnCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOff();
    }
}
