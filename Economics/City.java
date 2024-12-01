package Economics;

import Buildings.Building;

import java.util.List;
import java.util.Random;

public class City {
    private  static double budget;
    private final List<Building> buildings;
    public City(double initialBudget, List<Building> buildings){
        budget = initialBudget;
        this.buildings = buildings;


    }
    public void RandomEconomicsState() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        EconomicsState state;
        double income;
        if (randomNum < 50) {
            state =  new EconomicsStagnation();
            System.out.println("The economy is in stagnation!");
            income = state.calculateIncome(buildings);
            budget += income;
            System.out.println("Total income: $" + income + ". Current budget: $" + budget);
        }
        else if (randomNum < 75) {
            state =  new EconomicsGrowth();
            System.out.println("The economy is in growth!");
            income = state.calculateIncome(buildings);
            budget += income;
            System.out.println("Total income: $" + income + ". Current budget: $" + budget);
        }
        else {
            state =  new EconomicsCrisis();
            System.out.println("The economy is in crisis!");
            income = state.calculateIncome(buildings);
            budget += income;
            System.out.println("Total income: $" + income + ". Current budget: $" + budget);
        }
    }


}
