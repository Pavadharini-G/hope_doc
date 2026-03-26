abstract class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    abstract void attack();
}

class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " sword attack...!");
    }
}

class Archer extends Character {
    Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " rain arrows...!");
    }
}

class Mage extends Character {
    Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " fire balls...!");
    }
}

public class game {
    public static void main(String[] args) {
        Character c1 = new Warrior("Knight");
        Character c2 = new Archer("Ballistas");
        Character c3 = new Mage("Tower mages");

        c1.attack();
        c2.attack();
        c3.attack();
    }
}