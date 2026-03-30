abstract class smartdevice{
    abstract void turnon();
    abstract void turnoff();
    void deviceinfo()
    {
        System.out.println("It is a device");
    }
}
class light extends smartdevice{
    @Override
    void turnon(){
        System.out.println("Light On");
        deviceinfo();
        turnoff();
    }
    @Override
    void turnoff()
    {
        System.out.println("Light Off");
    }
}
class fan extends smartdevice{
    @Override
    void turnon(){
        System.out.println("Fan On");
        deviceinfo();
        turnoff();
    }
    @Override
    void turnoff()
    {
        System.out.println("Fan Off");
    }
}
//additional lines before main to use interface
interface remote{
    void change();
}
class tv implements remote{
    @Override
    public void change(){
        System.out.println("change channel");
    }
}
public class smart {
    public static void main(String[] args)
    {
        smartdevice device=new light();
        smartdevice device2=new fan();
        device.turnon();
        //device.deviceinfo();
        System.out.println("");
        device2.turnon();
    }
}
