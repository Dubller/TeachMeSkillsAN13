package Administration;

public class Worker extends Staff{
    public Worker()
    {
        setPosition("Worker");
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
        System.out.println(getPosition() + " is a blue color worker...");
    }
}