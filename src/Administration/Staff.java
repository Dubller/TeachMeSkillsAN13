package Administration;

public abstract class Staff implements StaffMembers, BlueColorWorkers {

    // keyword - final
    // переменная константа - если нельзя изменить
    // класс final - нельзя унаследоваться
    // метод final - нельзя переопределить
    private String position;
    final private int birthDate = 1988; // константа

    // если тип ссылочный, то значения мы можем менять
    // но мы не можем менять ссылку переменной
    // Объект -> ссылку, если он final
    // мы можем менять его внутренние значения
    // но мы не можем поменять ссылку на часть памяти

    public Staff()
    {
        this.position = "Unknown";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    abstract void getFullDetails(); // как в случае с интерфейсом, я просто создал метод без тела
                                    // и отдал реализацию уже конкретных классам

    public int getBirthDate() {
        return birthDate;
    }

    final public void noOverride() // нельзя переопределить
    {
        System.out.println("This is final version of the method. No OVERRIDE...");
    }
}
