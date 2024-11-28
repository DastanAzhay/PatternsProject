package CityManager;

import CreationalPatterns.Building;
import CreationalPatterns.FactoriesFactory;
import CreationalPatterns.HouseFactory;
import CreationalPatterns.SchoolFactory;

public class BuildMenu {
    Building building = null;
    public void buildMenu(int choice) {

                switch (choice) {
            case 1:
                building = new HouseFactory().createBuilding("house");
                building.build();
                System.out.println(building.getInfo());
                break;
            case 2:
                building = new FactoriesFactory().createBuilding("factory");
                building.build();
                System.out.println(building.getInfo());
                break;
            case 3:
                building = new SchoolFactory().createBuilding("school");
                building.build();
                System.out.println(building.getInfo());
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice, please try again.");
                }
    }
}
