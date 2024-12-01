package Economics;

import Buildings.Building;

import java.util.List;

public interface EconomicsState {
    double calculateIncome(List<Building> buildings);
}
