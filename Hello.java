import CreationalPatterns.*;

public class Hello {
    public static void main(String[] args){
        BuildingFactory houseFactory = new HouseFactory();
        BuildingFactory commercialBuildingsFactory = new CommercialBuildingsFactory();
        BuildingFactory factoriesFactory = new FactoriesFactory();
        BuildingFactory schoolFactory = new SchoolFactory();
        Building factory = factoriesFactory.createBuilding("Factory");
        Building school = schoolFactory.createBuilding("School");
        Building house = houseFactory.createBuilding("house");
        Building house2 = houseFactory.createBuilding("house");
        Building commercialBuildings = commercialBuildingsFactory.createBuilding("Commercial Buildings");
        house.build();
        commercialBuildings.build();
        factory.build();
        school.build();
        System.out.println(house.getInfo());
        System.out.println(commercialBuildings.getInfo());
        System.out.println(factory.getInfo());
        System.out.println(school.getInfo());
        factory.destroy();
        house.destroy();
        school.destroy();
        System.out.println(factory.getInfo());
        System.out.println(house.getInfo());
    }
}
