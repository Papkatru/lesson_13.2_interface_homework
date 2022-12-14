package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.Track;
import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

import javax.swing.*;

public class GuiInterfaceWithList {

    private final CarStore carStore;
    private final TrackStore trackStore;

    public GuiInterfaceWithList(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car chooseCarInGui() {
        String desiredCar = (String) JOptionPane.showInputDialog(null, "Choose from dropdown menu",
                "Car:", JOptionPane.QUESTION_MESSAGE, null, carStore.allCars(), "");
        return carStore.lookup(desiredCar);
    }

    public Track chooseTrackInGui() {
        String desiredTrack = (String) JOptionPane.showInputDialog(null, "Choose from dropdown menu",
                "Track:", JOptionPane.QUESTION_MESSAGE, null, trackStore.allTracks(), "");
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(Car car, Track track) {
        if (car.isPitstopNeeded(track)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop needed in " + car.maxLapsForTrack(),
                    "Результат:",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop not needed ",
                    "Результат:",
                    1
            );
        }
    }
}
