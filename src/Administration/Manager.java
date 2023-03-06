package Administration;

public class Manager extends Staff{
    public Manager()
    {
        setPosition("Manager");
    }

    @Override
    void getFullDetails() {
        System.out.println("Abstract class has been overriden by " + getPosition());
    }

    @Override
    public void getStaffMemberPosition() {
        System.out.println(getPosition());
    }

    @Override
    public void blueColorWorkers() {
        System.out.println(getPosition() + " is not a blue color worker...");
    }
}
