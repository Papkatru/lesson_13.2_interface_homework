package guru.qa;

import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;
import guru.qa.service.ConsoleInterface;
import guru.qa.service.GuiInterfaceWithList;

public class Main {

    //Интерфейс с выпадающим списком
    public static void main(String[] args) {
        new Application(new GuiInterfaceWithList(
                new CarStore(),
                new TrackStore()
        )).run();
    }

    //Консольный интерфейс
    /*public static void main(String[] args) {
        new Application(new ConsoleInterface(
                new CarStore(),
                new TrackStore()
        )).run();
    }*/
}
