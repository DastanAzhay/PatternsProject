package CityManager;


import java.util.Scanner;

public class BuildingsManager {
    public void displayBuildingMenu() {
        Scanner scanner = new Scanner(System.in);
        BuildMenu buildMenu = new BuildMenu();
        DestroyMenu destroyMenu = new DestroyMenu();
        System.out.println("Select an action:");
        System.out.println("1. Build");
        System.out.println("2. Destroy");
        System.out.println("3. Get Info");
        System.out.println("4. Return to main menu");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                buildMenu.buildMenu(choice);
            case 2:
                destroyMenu.destroyMenu(choice);
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Try again!");

        }
         displayBuildingMenu();
    }
}


