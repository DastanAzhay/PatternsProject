package CityManager;

import CreationalPatterns.Building;
import CreationalPatterns.Factories;
import CreationalPatterns.House;
import CreationalPatterns.School;

import java.util.Scanner;

public class DestroyMenu {
    public void destroyMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a building to destroy:");
        System.out.println("1. House");
        System.out.println("2. Factory");
        System.out.println("3. School");
        System.out.println("4. Return to previous menu");
        int choice = sc.nextInt();
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
