package Buildings;


public abstract class Building {
    public String type;
    public  abstract void build();
    public abstract void destroy();
    public abstract  double generateIncome();
    public Building(String type) {
        this.type = type;
    }
    public String getInfo() {
        return "Building: " + type;
    }

}
