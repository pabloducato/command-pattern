package pl.kocan.command.pattern;

import pl.kocan.command.pattern.workshop.Robot;
import pl.kocan.command.pattern.workshop.WorkshopApp;

public class Main {

    public static void main(String[] args) {
        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();
    }
}
