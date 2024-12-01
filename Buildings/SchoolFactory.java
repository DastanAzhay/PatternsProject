package Buildings;

public class SchoolFactory extends BuildingFactory{
    @Override
    public Building createBuilding(String type) {
        if (type.equalsIgnoreCase("School")){
            return new School();
        }
        return null;
    }
}
