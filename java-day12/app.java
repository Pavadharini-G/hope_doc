class User
{
    String name;
    String phone;
    String address;
    String role="user";
    User()
    {
        System.out.println("By using super");

    }
    User(String name)
    {
        this.name=name;
        System.out.println("User created");
    }
    void diaplay()
    {
        System.out.println("Name:"+name);
        System.out.println("role:"+role);
    }
}
class Driver extends User{
    String role="Driver";
    String vehicle;
    
}
public class app {
    
}
