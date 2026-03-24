class User
{
    String name;
    String address;
    String phone;
    String role="User";
    User()
    {
        System.out.println("by using super");
    }
    User(String name)
    {
        this.name=name;
        System.out.println("User created");
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Role:"+role);
    }
}
class Driver extends User{
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle)
    {
        super(name);
        this.vehicle=vehicle;
    }
    void displayDriver()
    {
        super.display();
        System.out.println("vehicle:"+vehicle);
        System.out.println("Driver class Role:"+role);
        System.out.println("User class Role:"+super.role);
    }
}
public class delivery 
{
    public static void main(String[] args){
        Driver dr=new Driver("abc","car");
        dr.displayDriver();
    }
}
