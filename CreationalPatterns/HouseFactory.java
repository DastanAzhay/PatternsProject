package CreationalPatterns;

import java.util.Random;

public class HouseFactory extends BuildingFactory {
    @Override
    public Building createBuilding(String type) {
        if (type.equalsIgnoreCase("house")) {
            Random rand = new Random();
            int numofResidents = rand.nextInt(6) + 2;
            return new House(numofResidents);
        }
        return null;
    }
}
