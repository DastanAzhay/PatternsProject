package Buildings;

import java.util.Random;

public class House extends Building {
    private static int  numberOfResidents = 0;
    private static int houseNumber = 0;
    @Override
    public void build() {
        System.out.println("House has been built.");
        houseNumber++;


        numberOfResidents +=4;

    }

    @Override
    public double generateIncome() {
        return 25000;
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
        return super.getInfo() + "\nnumOfResidents: " + numberOfResidents + "\nNumber of Houses: " + houseNumber  ;
    }
}
