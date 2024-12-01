package Economics;

import Buildings.Building;

import java.util.List;

public class EconomicsCrisis implements EconomicsState {
     double totalIncome = 0;

    @Override
    public double calculateIncome(List<Building> buildings) {

        for (Building building : buildings) {
            totalIncome += building.generateIncome()*0.5;
        }
        return totalIncome;
    }
}
