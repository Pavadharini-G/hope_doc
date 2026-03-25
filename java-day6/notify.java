class notification{
    String name;
    String msg;
    notification(String name,String msg)
    {
        this.name=name;
        this.msg=msg;
    }
    void send()
    {
        System.out.println("sending notification from parent class");
    }
}
class emailnotification extends notification{
    emailnotification(String name,String msg)
    {
        super(name,msg);
    }
    void send()
    {
        System.out.println("Sending email to:"+name);
        System.out.println("Message:"+msg);
    }
    void changeReceiverEmail()
    {
        System.out.println("receiver email changed");
    }
}
class SMSnotification extends notification{
    SMSnotification(String name,String msg)
    {
        super(name,msg);
    }
    void send()
    {
        System.out.println("Sending SMS notification");
    }
}
public class notify {
    public static void main(String[] args)
    {
        notification n;
        n=new emailnotification("test","order confirmed");
        n.send();
        n=new SMSnotification("test2","OTP is 234");
        n.send();
    }
}
