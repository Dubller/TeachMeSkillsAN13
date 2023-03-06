package Administration;

import java.util.Objects;

public class MyMain {
    public static void main(String[] args)
    {
        Staff[] members = new Staff[]{
                new Accountant(),
                new Director(),
                new Worker(),
        };

        for(Staff member : members)
        {
            System.out.println(member.getPosition());
        }

        Staff manager = new Manager();

        System.out.println(manager.getPosition());
        manager.getStaffMemberPosition();
        manager.getFullDetails();
        manager.blueColorWorkers();
        members[2].blueColorWorkers();


        String name = "Archil";
        String surname = "Sikharulidze";

        name.equals(surname); // Object -> equals()
        // главный класс для всех остальных классов

        System.out.println();
    }
}
