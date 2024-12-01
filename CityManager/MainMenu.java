package CityManager;

import Economics.City;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CityFacade cityFacade = new CityFacade();
//        City city = new City(5000000.0,);
        while (true) {
            System.out.println("City Manager");
            System.out.println("1. Build Buildings");
            System.out.println("2. Destroy Buildings");
            System.out.println("3. Show Buildings");
            System.out.println("4. Simulate Economy");

            System.out.println("0. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select a building to construct:");
                    System.out.println("1. House");
                    System.out.println("2. Factory");
                    System.out.println("3. School");
                    int buildChoice = sc.nextInt();
                    cityFacade.buildBuilding(buildChoice);
                    break;
                case 2:
                    System.out.println("Select a building to destroy:");
                    System.out.println("1. House");
                    System.out.println("2. Factory");
                    System.out.println("3. School");
                    int destroyChoice = sc.nextInt();
                    cityFacade.destroyBuilding(destroyChoice);
                    break;
                case 3:
                    cityFacade.getBuildings();
                    break;
                case 4:
//                    city.RandomEconomicsState();
                    break;

                case 0:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
