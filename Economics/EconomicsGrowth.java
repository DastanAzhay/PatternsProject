package Economics;

import Buildings.Building;

import java.util.List;

public class EconomicsGrowth implements EconomicsState {
     double totalIncome = 0;
    @Override
    public double calculateIncome(List<Building> buildings) {

        for (Building building : buildings) {
            totalIncome += building.generateIncome()*1.5;
        }
        return totalIncome;
    }
}
