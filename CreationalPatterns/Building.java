package CreationalPatterns;


public abstract class Building {
    public String type;
    public  abstract void build();
    public abstract void destroy();
    public Building(String type) {
        this.type = type;
    }
    public String getInfo() {
        return "=============================="+"\nBuilding: " + type + "\n";
    }

}
