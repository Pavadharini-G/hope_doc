//package DAY9;

// Abstract class
abstract class SmartDevice {
    String name;

    abstract void turnOn();
    abstract void turnOff();
}

// Light class
class Light extends SmartDevice {
    void turnOn() {
        System.out.println("Turn On The Light");
    }

    void turnOff() {
        System.out.println("Turn Off The Light");
    }
}

// AC class
class Ac extends SmartDevice {
    void turnOn() {
        System.out.println("Turn On the AC");
    }

    void turnOff() {
        System.out.println("Turn Off the AC");
    }
}

// Trigger interface
interface Trigger {
    boolean isTrigger();
}

// Motion trigger
class MotionTrigg implements Trigger {
    public boolean isTrigger() {
        System.out.println("Motion detected");
        return true;
    }
}

// Temperature trigger
class TempTrigg implements Trigger {
    int temp;

    TempTrigg(int temp) {
        this.temp = temp;
    }

    public boolean isTrigger() {
        if (temp > 30) {
            System.out.println("Temperature above threshold");
            return true;
        }
        return false;
    }
}

// Time trigger
class TimeTrigg implements Trigger {
    int time;

    TimeTrigg(int time) {
        this.time = time;
    }

    public boolean isTrigger() {
        if (time > 30) {
            System.out.println("Time Trigger");
            return true;
        }
        return false;
    }
}

// Action interface
interface Action {
    void execute();
}

// Turn ON action
class TurnOnAction implements Action {
    SmartDevice device;

    TurnOnAction(SmartDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOn();
    }
}

// Turn OFF action
class TurnOffAction implements Action {
    SmartDevice device;

    TurnOffAction(SmartDevice device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }
}

// Rule class
class Rule {
    Trigger trig;
    Action act;

    Rule(Trigger trig, Action act) {
        this.trig = trig;
        this.act = act;
    }

    void result() {
        if (trig.isTrigger()) {
            act.execute();
        } else {
            System.out.println("Trigger condition not met");
        }
    }
}

// Main class
public class automation {
    public static void main(String[] args) {
        //SmartDevice ac = new Ac();
        SmartDevice l = new Light();

        Trigger t = new MotionTrigg();
        Action a = new TurnOnAction(l);
        //Action a = new TurnOnAction(ac);

        Rule r = new Rule(t, a);
        r.result();
    }
}