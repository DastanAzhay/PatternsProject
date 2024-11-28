package CreationalPatterns;

public class CommercialBuildingsFactory extends BuildingFactory{
    @Override
    public Building createBuilding(String type) {
        if (type.equalsIgnoreCase("Commercial Buildings")) {
            return new CommercialBuildings();
        }
        return null;
    }
}
