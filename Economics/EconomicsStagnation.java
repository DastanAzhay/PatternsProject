package Economics;

import Buildings.Building;

import java.util.List;

public class EconomicsStagnation implements  EconomicsState{
     double totalIncome = 0;
    public double calculateIncome(List<Building> buildings) {

        for (Building building : buildings) {
            totalIncome += building.generateIncome();
        }
        return totalIncome;
    }
}
