class Locker
{
    private int LockerId;
    private boolean isLocked;
    private String storedItem;   
    private int pincode;
    Locker(int LockerId,int pincode)
    {
        this.LockerId=LockerId;
        this.pincode=pincode;
        isLocked=true;
    }
    public void display()
    {
        System.out.println("LOCKER DETAILS");
        System.out.println("---------------");
        System.out.println("LockerId:"+LockerId);
        if(storedItem==null)
        {
            System.out.println("Locker is empty");
        }
        else
        {
            System.out.println("Stored Item:"+storedItem);
        }

    }
    public void storeItem(String item,int pin)
    {
        unlock(pin);
        if(!isLocked)
        {
            storedItem=item;
            System.out.println("Stored successfully");
        }
    }
    public void retrieveItem(int pin)
    {
        unlock(pin);
        if(!isLocked && storedItem!=null)
        {
            System.out.println("Retrieved item:"+storedItem);
            storedItem=null;
        }
        else if(storedItem==null)
        {
            System.out.println("locker is empty");
        }
        else
        {
            System.out.println("Locker is locked");
        }       
    }
    public void unlock(int pin)
    {
        if(pin==pincode)
        {            
            System.out.println("The locker is unlocked");
            isLocked=false;
        }
        else
        {
            System.out.println("The locker has been blocked due to incorrect pin");
            System.exit(0);
        }
    }
    public void lock()
    {
        if(isLocked)
        {
            System.out.println("The locker is already locked");
        }
        else
        {
            isLocked=true;
            System.out.println("The locker has been locked");
        }
    }
}
public class lockersystem {
    public static void main(String[] args) {
        Locker l=new Locker(5147,123456);
        l.unlock(123456);  //  change this value to get incorrect pin
        l.display();
        System.out.println("===============");
        l.storeItem("Bag",123456);
        System.out.println("===============");
        l.display();
        System.out.println("===============");
        l.retrieveItem(123456);
        System.out.println("===============");
        l.display();
        l.lock();
    }
}
