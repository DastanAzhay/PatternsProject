package CityManager;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("City Manager");
            System.out.println("1. Buildings");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    BuildingsManager buildingsManager = new BuildingsManager();
                    buildingsManager.displayBuildingMenu();
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
