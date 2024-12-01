package CityManager;

import Buildings.Building;
import Buildings.FactoriesFactory;
import Buildings.HouseFactory;
import Buildings.SchoolFactory;

import java.util.ArrayList;
import java.util.List;


public class CityFacade {

    private final BuildMenu buildMenu;
    private final DestroyMenu destroyMenu;
    private List<Building> buildings;

    public CityFacade() {
        this.buildMenu = new BuildMenu();
        this.destroyMenu = new DestroyMenu();
        this.buildings = new ArrayList<>();
    }

    public void buildBuilding(int choice) {
        Building building = null;
        switch (choice) {
            case 1:
                building = new HouseFactory().createBuilding("house");
                building.build();
                buildings.add(building);
                break;
            case 2:
                building = new FactoriesFactory().createBuilding("factory");
                building.build();
                buildings.add(building);
                break;
            case 3:
                building = new SchoolFactory().createBuilding("school");
                building.build();
                buildings.add(building);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println(building.getInfo());
    }

    public void destroyBuilding(int choice) {
        Building building = null;
        switch (choice) {
            case 1:
                building = new HouseFactory().createBuilding("house");
                break;
            case 2:
                building = new FactoriesFactory().createBuilding("factory");
                break;
            case 3:
                building = new SchoolFactory().createBuilding("school");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        building.destroy();
    }

    public void getBuildings() {
        for (Building building : buildings) {
            System.out.println(building.getInfo());
        }
    }
}
