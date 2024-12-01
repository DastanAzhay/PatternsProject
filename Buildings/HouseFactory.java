package Buildings;

public class HouseFactory extends BuildingFactory {
    @Override
    public Building createBuilding(String type) {
        if (type.equalsIgnoreCase("house")) {
            return  new House();
        }
        return null;
    }
}
