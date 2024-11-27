package CreationalPatterns;

public class House extends Building {
    private int numberOfResidents = 0;
    private static int houseNumber = 0;
    @Override
    public void build() {
        System.out.println("CreationalPatterns.House has been built.");
        houseNumber++;

    }

    @Override
    public void destroy() {
        System.out.println("CreationalPatterns.House has been destroyed.");
        houseNumber--;


    }

    public House(int initialResidents) {
        super("CreationalPatterns.House");
        this.numberOfResidents =initialResidents;

    }

    @Override
    public String getInfo() {
        return super.getInfo() + "numOfResidents: " + numberOfResidents + "\nNumber of Houses: " + houseNumber;
    }
}
