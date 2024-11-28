package CreationalPatterns;

public class House extends Building {
    private int numberOfResidents = 0;
    private static int houseNumber = 0;
    @Override
    public void build() {
        System.out.println("House has been built.");
        houseNumber++;
        numberOfResidents+=4;

    }

    @Override
    public void destroy() {
        System.out.println("House has been destroyed.");
        houseNumber--;
        numberOfResidents -=4;


    }

    public House() {
        super("House");

    }

    @Override
    public String getInfo() {
        return super.getInfo() + "numOfResidents: " + numberOfResidents + "\nNumber of Houses: " + houseNumber;
    }
}
