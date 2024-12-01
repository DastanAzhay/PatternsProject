package CityManager;

import Economics.City;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Economics.City Manager");
            System.out.println("1. Buildings");
            System.out.println("2. Show Economics");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            BuildingsManager buildingsManager = new BuildingsManager();

            switch (choice) {

                case 1:
                    buildingsManager.displayBuildingMenu();
                    break;
                case 2:
                    City city = new City(5000000.0, buildingsManager.getBuildings());
                    city.RandomEconomicsState();
                    break;
                case 0:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again!  ");
            }

        }
    }
}
