import CreationalPatterns.Building;
import CreationalPatterns.BuildingFactory;
import CreationalPatterns.HouseFactory;

public class Hello {
    public static void main(String[] args){
        BuildingFactory houseFactory = new HouseFactory();
        Building house = houseFactory.createBuilding("house");
        Building house2 = houseFactory.createBuilding("house");
        house.build();
        house2.build();
        System.out.println(house.getInfo());
    }
}
