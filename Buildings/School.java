package Buildings;

public class School extends Building {
    private static int numberOfSchools = 0;

    @Override
    public  double generateIncome() {
        return 50000;
    }

    @Override
    public void destroy() {
        System.out.println("|||||||||||||||||||| A L E R T ||||||||||||||||||||");
        System.out.println( "School has been destroyed." );
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");
        numberOfSchools--;
    }

    public School() {
        super("School");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nNumber of Schools: " + numberOfSchools;
    }

    @Override
    public void build() {
        System.out.println("School has been built.");
        numberOfSchools++;
    }
}
