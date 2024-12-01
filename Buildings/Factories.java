package Buildings;

public class Factories extends Building {
    private static int numberOfFactories=0;
    @Override
    public void build() {
        System.out.println("Factory has been built.");
        numberOfFactories++;
    }

    @Override
    public void destroy() {
        System.out.println("Factory has been destroyed.");
        numberOfFactories--;

    }
    public Factories(){
        super("Factory");
    }

    @Override
    public double generateIncome() {
        return 100000;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nNumber of Factories: " + numberOfFactories+"\n";
    }
}
