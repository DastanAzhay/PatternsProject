package Buildings;

public class FactoriesFactory extends BuildingFactory {
    @Override
    public Building createBuilding(String type) {
        if (type.equalsIgnoreCase("Factory")){
            return  new Factories();
        }
        return null;
    }
}
