package CityManager;

import CreationalPatterns.Building;
import CreationalPatterns.Factories;
import CreationalPatterns.House;
import CreationalPatterns.School;

public class DestroyMenu {
    public void destroyMenu(int choice) {
        Building building = null;
        switch (choice) {
            case 1:
                building = new House();
                building.destroy();
                break;
            case 2:
                building = new Factories();
                building.destroy();
                break;
            case 3:
                building = new School();
                building.destroy();
                break;
        }

    }
}
