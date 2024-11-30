package CityManager;

import CreationalPatterns.Building;
import CreationalPatterns.FactoriesFactory;
import CreationalPatterns.HouseFactory;
import CreationalPatterns.SchoolFactory;

import java.util.Scanner;

public class BuildMenu {
    Building building = null;

    public void buildMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a building to construct:");
        System.out.println("1. House");
        System.out.println("2. Factory");
        System.out.println("3. School");
        System.out.println("4. Return to previous menu");
        int choice = scanner.nextInt();
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
