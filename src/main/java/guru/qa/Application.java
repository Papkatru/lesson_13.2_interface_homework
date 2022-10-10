package guru.qa;

import guru.qa.domain.Car;
import guru.qa.domain.Track;
import guru.qa.service.ConsoleInterface;
import guru.qa.service.GuiInterfaceWithList;

public class Application {

    //Интерфейс с выпадающим списком
    private final GuiInterfaceWithList userInterface;
    public Application(GuiInterfaceWithList userInterface) {
        this.userInterface = userInterface;
    }

    void run() {
        Car car = userInterface.chooseCarInGui();
        Track track = userInterface.chooseTrackInGui();
        userInterface.showResult(car, track);
    }


    //Консольный интерфейс
    /*private final ConsoleInterface userInterface;
    public Application(ConsoleInterface userInterface) {
        this.userInterface = userInterface;
    }

    void run() {
        Car car = userInterface.chooseCarInConsole();
        Track track = userInterface.chooseTrackInConsole();
        userInterface.showResult(car, track);
    }*/
}
