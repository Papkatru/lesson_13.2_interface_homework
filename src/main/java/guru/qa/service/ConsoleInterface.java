package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.Track;
import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

import java.util.Scanner;

public class ConsoleInterface {

    private final CarStore carStore;
    private final TrackStore trackStore;
    private final Scanner sc = new Scanner(System.in);

    public ConsoleInterface(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car chooseCarInConsole() {
        System.out.println("Choose a car:");
        String desiredCar = sc.next();
        return carStore.lookup(desiredCar);
    }

    public Track chooseTrackInConsole() {
        System.out.println("Choose a track:");
        String desiredTrack = sc.next();
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(Car car, Track track) {
        if (car.isPitstopNeeded(track)) {
            System.out.println("Pit-stop needed in " + car.maxLapsForTrack());
        } else {
            System.out.println("Pit-stop not needed");
        }
    }
}
