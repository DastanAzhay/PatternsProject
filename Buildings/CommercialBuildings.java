package Buildings;

public class CommercialBuildings extends Building{
    @Override
    public void build() {
        System.out.println("Commercial building has been built.");
    }

    @Override
    public void destroy() {
        System.out.println("Commercial building has been destroyed.");
    }
    public CommercialBuildings(){
        super("Commercial Buildings");
    }
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public double generateIncome() {
        return 150000;
    }
}
