package CityManager;


import Buildings.Building;

import java.util.List;
import java.util.Scanner;

public class BuildingsManager {
    BuildMenu buildMenu = new BuildMenu();
    DestroyMenu destroyMenu = new DestroyMenu();
    public void displayBuildingMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action:");
        System.out.println("1. Build");
        System.out.println("2. Destroy");
        System.out.println("3. Get Info");
        System.out.println("4. Return to main menu");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                buildMenu.buildMenu();
                break;
            case 2:
                destroyMenu.destroyMenu();
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Try again!");

        }
         displayBuildingMenu();
    }
    public List<Building> getBuildings() {
        return buildMenu.getBuildings();
    }

}


