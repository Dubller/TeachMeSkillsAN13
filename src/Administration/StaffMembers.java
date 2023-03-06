package Administration;

public interface StaffMembers {
    void getStaffMemberPosition();

    // Новые фишки в Интерфейсе
    default void defaultMethod()
    {
        System.out.println("By default realization...");
    }

    // только когда нужен для внутреннего употребления в интерфейсе
    // не доступен извне
    private void privateMethod()
    {
        System.out.println("This is a private method...");
    }

    // если мы вставляем в интерфейс переменную нам нужно её инициализировать
    String interfaceName = "StaffMembers";
}